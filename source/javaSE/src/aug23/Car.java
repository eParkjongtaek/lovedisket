package aug23;

class Car {
protected int speed;
protected String name;
Car(){
speed = 0;
name = null;
}
Car(String name){
this.name = name;
}
public void speedUp(){
speed++;
}
public void speedDown(){
speed--;
}
public void stop(){
speed = 0;
}
public void display(){
System.out.println("�ڵ��� �̸�" + name);
System.out.println("�ڵ��� �ӵ�" + speed);
}
}