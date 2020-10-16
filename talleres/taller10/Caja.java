
public class Caja {
public int value;
public String key;
public Caja(String key,int value) {
	this.value=value;
	this.key=key;
}
public int abrir(String key) {
	if(this.key==key) {
		return value;
	}
	return 0;
}


}
