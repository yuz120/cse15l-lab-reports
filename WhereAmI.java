class WhereAmI {
    public static void main (String[] args){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir")); // 这个program会显示file在哪里。
    }
}