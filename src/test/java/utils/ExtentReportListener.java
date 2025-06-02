package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// Clase Listener que implementa ITestListener de TestNG
public class ExtentReportListener implements ITestListener {

    public ExtentSparkReporter sparkReporter; // Para el reportero de HTML (dashboard)
    public ExtentReports extent;             // Clase principal para la gestión de reportes
    public ExtentTest test;                  // Para cada entrada de prueba individual

    String reportFileName; // Nombre dinámico del reporte

    // Método que se ejecuta al inicio de todas las suites de prueba
    public void onStart(ITestContext context) {
        // Generar un nombre de archivo único con fecha y hora para evitar sobrescribir reportes
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        reportFileName = "ReporteDePruebas_" + timeStamp + ".html";

        // Definir la ruta donde se guardará el reporte.
        // Se guardará en 'target/surefire-reports/'
        String reportPath = System.getProperty("user.dir") + File.separator + "target" +
                            File.separator + "surefire-reports" + File.separator + reportFileName;

        sparkReporter = new ExtentSparkReporter(reportPath);
        // Configurar la apariencia y los metadatos del reporte
        sparkReporter.config().setDocumentTitle("Reporte de Automatización TGR"); // Título en la pestaña del navegador
        sparkReporter.config().setReportName("Resultados de Pruebas Automatizadas"); // Título principal del reporte
        sparkReporter.config().setTheme(Theme.STANDARD); // Puedes usar Theme.DARK para un tema oscuro
        sparkReporter.config().setEncoding("utf-8"); // Asegura la codificación para caracteres especiales (ñ, tildes)
        sparkReporter.config().setCss("/* Tu CSS personalizado aquí si lo deseas */"); // Puedes inyectar CSS custom
        sparkReporter.config().setJs("/* Tu JavaScript personalizado aquí si lo deseas */"); // Puedes inyectar JS custom

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Información del sistema/ambiente que aparecerá en el dashboard
        extent.setSystemInfo("Nombre del Entorno", "QA (Ambiente de Pruebas)");
        extent.setSystemInfo("Automatizador", "Diego / Equipo QA");
        extent.setSystemInfo("Sistema Operativo", System.getProperty("os.name"));
        extent.setSystemInfo("Navegador Utilizado", "Google Chrome"); // Podrías obtener esto dinámicamente
        extent.setSystemInfo("Versión de Java", System.getProperty("java.version"));
    }

    // Método que se ejecuta al inicio de cada método de prueba
    public void onTestStart(ITestResult result) {
        // Crea una nueva entrada de prueba en el reporte con el nombre del método de prueba
        test = extent.createTest(result.getName());
    }

    // Método que se ejecuta cuando una prueba pasa con éxito
    public void onTestSuccess(ITestResult result) {
        // Marca la prueba como PASADA en el reporte con un mensaje y color verde
        test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " -- PRUEBA SUPERADA", ExtentColor.GREEN));
    }

    // Método que se ejecuta cuando una prueba falla
    public void onTestFailure(ITestResult result) {
        // Marca la prueba como FALLIDA en el reporte con un mensaje y color rojo
        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " -- PRUEBA FALLIDA", ExtentColor.RED));
        // Añade la excepción o mensaje de error que causó la falla
        test.fail(result.getThrowable());

        // Opcional: Adjuntar captura de pantalla si la prueba falla
        // Si tienes una utilidad para tomar capturas de pantalla, la invocarías aquí
        /*
        try {
            // Ejemplo: Suponiendo que tienes un método estático para tomar la captura
            String screenshotPath = CaptureScreenshot.getScreenshot(result.getName()); // Necesitas implementar este método
            test.addScreenCaptureFromPath(screenshotPath); // Añade la captura al reporte
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    // Método que se ejecuta cuando una prueba es omitida (skipped)
    public void onTestSkipped(ITestResult result) {
        // Marca la prueba como OMITIDA en el reporte con un mensaje y color naranja
        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " -- PRUEBA OMITIDA", ExtentColor.ORANGE));
    }

    // Método que se ejecuta al final de todas las suites de prueba
    public void onFinish(ITestContext context) {
        // ¡MUY IMPORTANTE! Esto guarda los datos recopilados en el archivo HTML.
        // Si no se llama a flush(), el reporte estará vacío.
        extent.flush();
    }

    // Métodos de ITestListener que no se usarán directamente en este ejemplo, pero son necesarios para la interfaz
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    public void onTestFailedWithTimeout(ITestResult result) {}
}