package com.hcl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LogTest {

	private static final List Log = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Log> summaryLog = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("D://CallLogFile.CSV"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] s = line.split(",");
			summaryLog.add(new Log(s[1], Double.parseDouble(s[2]), s[0]));
		}
		Collections.sort(Log);
		Collections.sort(Log);
		Collections.reverse(summaryLog);
		System.out.println("Call-Logs");
		System.out.printf("%s(%s)\t\t\t%-20s\n", "Caller", "Name", "Duration");
		for (Log e : summaryLog) {
			System.out.println(e);
		}
		br.close();

	}

}


