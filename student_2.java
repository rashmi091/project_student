class student_2 extends course_det{
    String name="Rashmi";
    String dept="BCA";
    int sem=4;
    String getname(){
        return name;
    }
    String getdept(){
        return dept;
    }
    int getsem(){
        return sem;
    }
    public static void main(String args[]){
        student_2 s1=new student_2();
        
        System.out.println("Name is: "+s1.getname());
        System.out.println("Department is: "+s1.getdept());
        System.out.println("Semister is: "+s1.getsem());
        String s[]=s1.getCourse();
        System.out.println("Courses are: ");
        for(String j:s){
            System.out.println(j);
        }
        int m[]= s1.getMarks();
        System.out.println("Courses for which marks is less than 40: ");
        for(int i:m){
            if(i<40){
                s1.setMarks(i);
                System.out.println(i);

            }
        }
    }
}