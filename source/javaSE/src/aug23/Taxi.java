package aug23;

class Taxi extends Car {
private int charge; //�ýÿ��
private boolean fare; //��������
private String company; //�ý�ȸ���̸�
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
System.out.println("�ý�ȸ���̸� : " + company);
System.out.println("��� ���� : " + fare);
System.out.println("��� : " + charge);
}

}