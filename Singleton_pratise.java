public static Singleton_pratise {
    private static Singleton_pratise single_object = null;
    public static Singleton_pratise getInstance(){
        if(single_object == null){
            single_object = new Singleton_pratise();
        }
        else{
            return single_object;
        }
    }
}