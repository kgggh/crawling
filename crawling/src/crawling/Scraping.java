package crawling;



import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import vo.stockVO;

public class Scraping {
	public static void main(String[] args) throws Exception {
		List<stockVO> stockList = new ArrayList<>();
		stockVO stockVO = new stockVO();
		
		String URL = "https://finance.naver.com/sise/lastsearch2.nhn";
		Document document = Jsoup.connect(URL).get();
		Elements elem = document.select("table[class=type_5] tbody");
		
		for(Element content : elem) {
			Elements tdContents = content.select("tr td");
			System.out.println(tdContents.text());
			System.out.println(tdContents.get(2).text());
			System.out.println(tdContents.get(3).text());
			System.out.println(tdContents.get(4).text());
//			stockVO.setRanking(tdContents.get(1).text());
//			stockVO.setName(tdContents.get(2).text());
//			stockVO.setSearchRate(tdContents.get(3).text());
//			stockVO.setPresentPrice(tdContents.get(4).text());
//			stockVO.setFullTime(tdContents.get(5).text());
//			stockVO.setFluctuationRate(tdContents.get(6).text());
//			stockVO.setPrice(tdContents.get(7).text());
//			stockVO.setUp(tdContents.get(8).text());
//			stockVO.setDown(tdContents.get(9).text());
//			stockVO.setPer(tdContents.get(10).text());
//			stockVO.setRoe(tdContents.get(11).text());
//			stockList.add(stockVO);
		}
	}
}
