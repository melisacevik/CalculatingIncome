public class Employee {


    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if( this.salary >= 1000){
            return ( this.salary * 3 ) / 100;
        }else{
            return 0;
        }
    }

    public double bonus(){
        if( this.workHours > 40){

            double bonus = (workHours - 40 )*30;
            return this.salary + bonus;

        }else{
            return 0;
        }
    }

    public double raiseSalary(){

        int year = 2021 - hireYear;
        if( year > 19){
            return (this.salary * 15 ) /100;
        }else if( year > 9 && year < 20){
            return (this.salary * 10) /100;
        }else if( year < 10){
            return (this.salary * 5) / 100;
        }
        return 0;
    }

    public void print(){
        System.out.println("Adı:\t" + this.name);
        System.out.println("Maaşı:\t" + this.salary);
        System.out.println("Çalışma saati:\t" + this.workHours);
        System.out.println("Başlangıç yılı:\t" + this.hireYear);
        System.out.println("Vergi:\t" + this.tax());
        System.out.println("Bonus:\t" + this.bonus());
        System.out.println("Vergi Artışı:" + this.raiseSalary());
        System.out.println("Toplam Maaş: " + (this.salary + bonus() + raiseSalary() - tax()));
    }

}
