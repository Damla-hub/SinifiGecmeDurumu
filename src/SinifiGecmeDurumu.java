import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        double average,mat,fzk,turkce,kimya,mzk;
        int dersSayisi = 5;
        Scanner inp =new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat=inp.nextDouble();
        System.out.print("Fizik notunu giriniz: ");
        fzk=inp.nextDouble();
        System.out.print("Türkçe notunu giriniz: ");
        turkce=inp.nextDouble();
        System.out.print("Kimya notunu giriniz: ");
        kimya=inp.nextDouble();
        System.out.print("Müzik notunu giriniz: ");
        mzk=inp.nextDouble();
        dersSayisi= mat>=0 && mat<=100 ? dersSayisi : dersSayisi-1;
        mat= mat>=0 && mat<=100 ? mat : 0;
        dersSayisi= fzk>=0 && fzk<=100 ? dersSayisi : dersSayisi-1;
        fzk=fzk>=0 && fzk<=100 ? fzk : 0 ;
        dersSayisi= turkce>=0 && turkce<=100 ? dersSayisi : dersSayisi-1;
        turkce=turkce>=0 && turkce<=100 ? turkce :0;
        dersSayisi= kimya>=0 && kimya<=100 ? dersSayisi : dersSayisi-1;
        kimya=kimya>=0 && kimya<=100 ? kimya :0;
        dersSayisi= mzk>=0 && mzk<=100 ? dersSayisi : dersSayisi-1;
        mzk=mzk>=0 && mzk<=100 ? mzk : 0;
        if(dersSayisi>0){
            average=(mat+fzk+turkce+kimya+mzk)/dersSayisi;
            if(average<55){
                System.out.print("Sınıfta kaldınız.Seneye görüşmek üzere!");
            }else{
                System.out.print("Tebrikler! Sınıfı geçtiniz.");
            }
            System.out.print("\nOrtalamanız: "+average);
        }else {
            System.out.print("Sayılar 0'a bölünemez.");
        }

    }
}
