package crawling;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import vo.KoreaStats;

public class Scraping {
	public static void main(String[] args) throws Exception {
		String KOREA_COVID_DATAS_URL = "http://ncov.mohw.go.kr/bdBoardList_Real.do?brdId=1&brdGubun=13";

		List<KoreaStats> koreaStatsList = new ArrayList<>();
        Document doc = Jsoup.connect(KOREA_COVID_DATAS_URL).get();
        Elements contents = doc.select("table tbody tr");
        for(Element content : contents){
            Elements tdContents = content.select("td");

            KoreaStats koreaStats = KoreaStats.builder()
                    .country(content.select("th").text())
                    .diffFromPrevDay((tdContents.get(0).text()))
                    .total((tdContents.get(1).text()))
                    .death((tdContents.get(2).text()))
                    .incidence((tdContents.get(3).text()))
                    .inspection((tdContents.get(4).text()))
                    .build();
            koreaStatsList.add(koreaStats);
        }
		System.out.println(koreaStatsList);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.KOREA);
		String today = sdf.format(date);
		
		String filePath = "/Users/gimgeonhui/Desktop/test/";
		String fileName = "log"+today+".csv";
		String makePath = filePath + File.separator + fileName;
		String NEWLINE = System.lineSeparator(); // 줄바꿈(\n)
		 
		File folder = new File(filePath);
		if (!folder.exists()) {
		    folder.mkdirs();    // 폴더가 없을경우 폴더 생성
		}
		 
		try {
		    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(makePath), "EUC-KR"));
		    bw.write("번호,이름,지역");
			bw.write(NEWLINE);
			
			bw.write("1,김철수,서울");
			bw.write("\n");
			
			bw.write("2,김영희,경기");
			bw.write("\r\n");
			
			bw.write("3,이철희,경북");
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
		    throw e;
		} 
	}
  }
	
