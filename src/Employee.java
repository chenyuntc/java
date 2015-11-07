/**
 * Created by cy on 15-11-7.
 */
public class Employee {
    int getSalary1(int normDays, int overtime) {
        return normDays * 80 + 100 * overtime;
    }

    int getSalary2(int normDays, int overtime) {
        return normDays * 100;
    }

    int getMoreSalary(int normDays, int overtime) {

        return getSalary1(normDays, overtime) > getSalary2(normDays, overtime) ? getSalary1(normDays, overtime) : getSalary2(normDays, overtime);
    }


}
