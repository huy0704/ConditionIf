package basic.dev;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		/**
		 * 9.4 viet chuong trinh bac 2 
		 */
		Scanner sc = new Scanner(System.in);		
		System.out.print("Nhập hệ số bậc 2, a = ");
        float a = sc.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = sc.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = sc.nextFloat();
        MainApp.giaiPTBac2(a, b, c);
    }
     
    /**
     * Giải phương trình bậc 2: ax2 + bx + c = 0
     * 
     * @param a: hệ số bậc 2
     * @param b: hệ số bậc 1
     * @param c: số hạng tự do
     */
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        }else {
        	// tính delta
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            // tính nghiệm
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
        }
        /**
         * 9.1 Viết chương trình nhập vào một số nguyên. Kiểm tra số đó nguyên dương hay nguyên âm. In ra màn hình kết quả
         */
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap vao so ban muon kiem tra:");
            int i = sc.nextInt();           
            if (i > 0 )
            {
            	System.out.println(i + " la so duong");
            }else 
            	if(i < 0) {
            		System.out.println(i + "  la so am");
            	}
            	else {
            		System.out.println("khong phai so duong cung khong phai so duong");
            	}
          /**
           * 9.2 viet so nguyen n.Kiem tra n chia het cho 3 hay 5. In ra man hinh           
           */
            System.out.println("viet so nguyen n ban muon kiem tra: ");
            int n = sc.nextInt();
            if (n % 3 == 0)
            {	
                System.out.println(n + " chia het cho 3 ");      	
            }else{ 
            	System.out.println(n + " khong chia het cho 3");
            }
            if (n % 5 == 0)
            {
            	System.out.println(n + " chia het cho 5");
            }else {
            	System.out.println(n + " khong chia het cho 5");
            }
            /**
             * 9.3 	Viết chương trình nhập vào tháng trong năm.In ra số ngày của tháng đó
             */
            System.out.println("nhap thang: ");
            int month = sc.nextInt();
            switch(month) {

            case 1:case 2:case 3:

                      	System.out.println(month + " la thang mua xuan");

                      break;

            case 4:case 5:case 6:

            			System.out.println(month + " la thang mua he");

                      break;
            case 7:case 8:case 9:

            			System.out.println(month + " la thang mua thu");

                      break;

            case 10:case 11:case 12:

            			System.out.println(month + " la thang mua dong");

                      break;

            default:

            			System.out.println(month + " khong co thang nay");
            			
            }           
            /**
             * 9.5 Viết chương trình nhập vào 3 số a, b, c. Kiểm tra có phải là3 cạnh của một tam giác không?
             */
            System.out.println("nhap canh a: ");
            double d = sc.nextDouble();
            System.out.println("nhap canh b: ");
            double e = sc.nextDouble();
            System.out.println("nhap canh c: ");
            double f = sc.nextDouble();

    		if ((d + e > f) || (d + f > e) || (e + f > d)) {
    			System.out.println("Đây là tam giác !");
    		}
    		if ((d == e) || (e == f) || (f == d)) {
    			System.out.println("Đây là tam giác cân !");
    		} else if ((d == e) && (e == f) && (f == d)) {
    			System.out.println("Đây là tam giác đều !");
    		} else if ((d * d == e * e + f * f) || (e * e == d * d + f * f) || (f * f == e * e + d * d)) {
    			System.out.println("Đây là tam giác vuông !");
    		} else {
    			System.out.println("Đây không phải tam giác");
    		}
            
            
        }
    }
       	
}
     
    

        





