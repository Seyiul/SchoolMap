package campusNavi;

import java.util.ArrayList;

public class MyPath {

   ArrayList <Integer> xArray = new ArrayList<Integer>();
   ArrayList <Integer> yArray = new ArrayList<Integer>();
   
   
   public MyPath(ArrayList<String> stops) {
      
      ArrayList<String> name = new ArrayList<String>();
      ArrayList<Integer> x = new ArrayList<Integer>();
      ArrayList<Integer> y = new ArrayList<Integer>();
       
      
       name.add("�����");      x.add(129); y.add(142);
       name.add("�߾ӵ�����");   x.add(425); y.add(168);
       name.add("15");       x.add(410); y.add(228);
       name.add("�������п�");    x.add(430); y.add(230);
       name.add("16");      x.add(396); y.add(375);
       name.add("17");      x.add(418); y.add(392);
       name.add("��õ��");     x.add(433); y.add(386);
       name.add("24");      x.add(442); y.add(411);
       name.add("���Ǵ�");       x.add(425); y.add(433);
       name.add("��������2");       x.add(457); y.add(462);
       name.add("���̿����뿬����");   x.add(382); y.add(491);
       name.add("��������");       x.add(398); y.add(512);
       name.add("����Ÿ��");      x.add(332); y.add(515);
       name.add("23");       x.add(320); y.add(479);
       name.add("22");       x.add(195); y.add(443);
       name.add("IT����");      x.add(210); y.add(467);
       name.add("21");      x.add(155); y.add(425);
       name.add("�۷ι�����");   x.add(135); y.add(418);
       name.add("20");       x.add(253); y.add(414);
       name.add("��������1");    x.add(222); y.add(400);
       name.add("19");      x.add(195); y.add(340);
       name.add("��������1");    x.add(159); y.add(325);
       name.add("��������2");    x.add(311); y.add(304);
       name.add("���̿��������");   x.add(357); y.add(365);
       name.add("18");       x.add(300); y.add(400);
       name.add("25");      x.add(265); y.add(230);
       name.add("26");      x.add(368); y.add(445);
       name.add("27");      x.add(446); y.add(290);
       
       
       
       
       for(int i=0; i<stops.size();i++)
       {
          for(int j=0; j<name.size();j++)
          {
             if(name.get(j).equals(stops.get(i)))
             {
                xArray.add(x.get(j)); 
                yArray.add(y.get(j)); 
             }
          }
       }
        
   }

}