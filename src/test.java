/**
 * Created by cy on 15-11-8.
 */
public class test {
    public static void main(String[] args) {
        //第一个测试类 ，测试雇员
        System.out.println("测试1: 雇员工资的计算");
        Employee lee = new Employee();
        System.out.printf("最多可得工资: %s\r\n", lee.getMoreSalary(22, 6));


        //第二个测试
        System.out.println("测试2: 圆柱体和球体的创建");
        Cylinder cy1 = new Cylinder(10, 2);
        Sphere sp1 = new Sphere(10);
        System.out.printf("cy1的面积是:%s, sp1的面积是:%s\r\n", cy1.area(), sp1.area());


        //第三个测试
        System.out.println("测试3: 多态");

        Circle[] circles = new Circle[5];
        circles[0] = new Cylinder(10, 3);
        circles[1] = new Cylinder(4, 4);

        circles[2] = new Sphere(4);
        circles[3] = new Sphere(5);
        circles[4] = new Sphere(6);
        for(Circle circle : circles){
            System.out.printf("面积是%s\r\n",circle.area());


        }
    }


}
