public class ToStringExample {
    int modelNum;
    int maxSpeed;
    double average;
    String name;
    String color;

    //constructor for that car
    ToStringExample(int modelNum, int maxSpeed, double average, String name, String color){
        this.modelNum = modelNum;
        this.maxSpeed = maxSpeed;
        this.average = average;
        this.name = name;
        this.color = color;
    }

    //manually defining the toString
//    public String toString(){
//        return ("This is dev defined toString " + name +" "+color);
//    }

    //toString by code editor
    @Override
    public String toString() {
        return "ToStringExample{" +
                "modelNum=" + modelNum +
                ", maxSpeed=" + maxSpeed +
                ", average=" + average +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    //o/p ToStringExample{modelNum=189, maxSpeed=210, average=12.5, name='audi', color='off-white'}

    public static void main(String[] args){
        ToStringExample car = new ToStringExample(189, 210, 12.5, "audi", "off-white");
        System.out.println(car.toString()); //ToStringExample@a09ee92, this come because
        //i have not initial the toString method, without defining that it will give class name @ hashcode
    }
}
