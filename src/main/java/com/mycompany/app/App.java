package com.mycompany.app;

import com.mycompany.app.core.CSVFileWriter;
import com.mycompany.app.core.ElasticsearchClient;
import com.mycompany.app.core.ReportGenerator;
import com.mycompany.app.core.ReportPrinter;
import com.mycompany.app.model.hourlyReport.ApiUsageReport;
import org.apache.commons.logging.Log;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        double beginOfDay = 1538936100000L;
        double endOfDay = 1539022499999L;
        String timeZone = "Asia/Katmandu";


        ElasticsearchClient client = new ElasticsearchClient();
        ReportGenerator reportGenerator = new ReportGenerator();
        ReportPrinter reportPrinter = new ReportPrinter();
        CSVFileWriter csvFileWriter = new CSVFileWriter();
//        ApiUsageReport apiUsageReport = reportGenerator.generateHourlyApiUsageReport(client.getApiUsage(beginOfDay,endOfDay,timeZone, "1h").getAggregations(), 1538936100000L);
        //reportPrinter.printHourlyApiUsageReport(apiUsageReport);
        //reportPrinter.generateJSONString(apiUsageReport);
        ApiUsageReport apiUsageReport = reportGenerator.generateDailyApiUsageReport(client.getApiUsage(beginOfDay,endOfDay,timeZone, "1h").getAggregations(), beginOfDay);


        client.createIndex();
        client.saveUsageData(apiUsageReport);
        //csvFileWriter.writeHourlyApiUsageToCSV(apiUsageReport);



    }
}
