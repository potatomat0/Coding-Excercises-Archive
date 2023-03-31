/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author Hoàng Minh Nhật
 * @date 11/6/2022
 */
public class mainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        C_NVVP nv1 = new C_NVVP("hoang minh nhat", "tphcm", "nam", 2003, 2, (float) 2.1);
        System.out.println("thong tin nhan vien: " + nv1.toString());

        C_NVKD nv2 = new C_NVKD("hoang minh nhat", "tphcm", "nam", 2003, 2, 97000, (float) 0.3);
        System.out.println(nv2.toString());

        C_CN nv3 = new C_CN("hoang minh nhat", "tp hcm", "nam", 2003, 2, (float) 1.4, 1300);
        System.out.println(nv3.toString());
    }

}
