class WhereAmI {
    public static void main (String[] args){
        System.out.println("Hey, I am here.");
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir")); 
    }
}