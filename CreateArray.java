class CreateArray{
	public static void main(String[] args){
		String str=args[0];
		String[] array = new String[str.length()];
	    for(int i = 0; i < args.length; i++){
	    array[i] = String.valueOf(str.charAt(i));
	    }
	    for(String a:array){
			System.out.println(a);
		}
	}
}