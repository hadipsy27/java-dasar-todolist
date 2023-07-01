public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){

        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i+1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){

        model[0] = "Belajar Java Dasar";
        model[1] = "Makan";
        model[2] = "Tidur";
        model[3] = "Bangun dari Tidur";
        model[4] = "Tidur Lagi";

        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){

        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        // jika model penuh maka resize ke ukuran 2x lipat
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke array yang NULL
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 1; i <= 25; i++) {
            addTodoList("Contoh todo list ke - " + i);
        }

        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static void removeTodoList(){

    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){

    }

    /**
     * Menampilkan view manambahkan todo list
     */
    public static void viewAddTodoList(){

    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){

    }
}