package org.adactin.automate;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AdactinAutomate extends BaseClass{
	
@BeforeClass
public static void beforeClass() {
browserLanch();
}

@Before
public void before() {
Date d=new Date();
System.out.println("test starts " +d);
}

@Test
public  void test1() {
	launchUrl("http://adactinhotelapp.com/index.php");
	login l = new login();
	sendkey(l.getUserName(), "devendrandeva");
	sendkey(l.getPassword(), "1234567890");
	clickButton(l.getClick());
	moveCursor(l.getPassword());
	contextClick();
	System.out.println("devaupdate");
	System.out.println("deva");
}

@Ignore
@Test
public void test2() {
	SearchHotel hotel = new SearchHotel();
selectValue(hotel.getLocation(), "New York");
selectValue(hotel.getHotels(), "Hotel Sunshine");
selectValue(hotel.getType(), "Super Deluxe");
selectValue(hotel.getRoomno(),"1");
hotel.getCheckindate().sendKeys("13/03/2021");
hotel.getCheckoutdate().sendKeys("14/03/2021");
selectValue(hotel.getAdultno(), "2");
selectValue(hotel.getChildno(), "0");
hotel.getSearch().click();
}

@Ignore
@Test
public void test3() {
	SelectHotel hotel = new SelectHotel();
	clickButton(hotel.getRadiobutton());
	clickButton(hotel.getContinueclick());
	
}

@Ignore
@Test
public void test4() {
	 BookaHotel bookaHotel = new BookaHotel();
	 sendkey(bookaHotel.getFirstname(), "devendran");
	 sendkey(bookaHotel.getLastname(), "veeraraj");
	 sendkey(bookaHotel.getAddress(), "chennai");
	 sendkey(bookaHotel.getCardnum(), "1234567890123456");
	 selectValue(bookaHotel.getCardtype(), "VISA");
	 selectValue(bookaHotel.getCdmon(), "4");
	 selectValue(bookaHotel.getCdyr(), "2013");
	 sendkey(bookaHotel.getCvv(), "890");
	 clickButton(bookaHotel.getBooknow());
}

@Ignore
@Test
public void test5() throws InterruptedException {
	BookingConfirmation bc = new BookingConfirmation();
	Thread.sleep(9000);
	scrollDown(bc.getOrderid());
	moveCursor(bc.getOrderid());
	doubleClick();
	screenshot("./src./ss/hotel.png");
	System.out.print("the booking orderID is ");
	getText(bc.orderid);

}


@After
public  void after() {
	Date d=new Date();
	System.out.println("test ends " +d);
}


@AfterClass
public static void afterClass() {
	// quit();
}



}
