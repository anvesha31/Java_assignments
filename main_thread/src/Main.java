public class main_thread {
    public static void main(String args[]){

        ThreadDemo td1= new ThreadDemo(("Anvesha "));
        td1.start();
        ThreadDemo td2 = new ThreadDemo("Raikwar");
        td2.start();
    }
}