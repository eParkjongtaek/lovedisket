package aug23;

class Taxi extends Car {
private int charge; //택시요금
private boolean fare; //할증여부
private String company; //택시회사이름
Taxi(String company){
this.company = company;
}
public void accounts() {
if(fare){
charge = speed * 12;
}else{
charge = speed * 10;
}
}
public void setFare(boolean fare) {
this.fare = fare;
}
public void display(){
System.out.println("택시회사이름 : " + company);
System.out.println("요금 할증 : " + fare);
System.out.println("요금 : " + charge);
}

}