package geometri;
public class PersegiPanjang {
    double panjang;
    double lebar;
 
public PersegiPanjang(double panjang, double lebar){
    this.panjang= panjang;
    this.lebar= lebar;
}
public double luas(){
    return panjang*lebar;
}
public double keliling(){
    return 2*(panjang+lebar);
}    
}
