package campusNavi;

import java.util.*;

public class DijkstraAlgorithm {
   
    final static double INFINITY = Double.MAX_VALUE;
    static double distance;
    static ArrayList<String> stops = new ArrayList<>();
      
      
    DijkstraAlgorithm(String start, String destination){
       
    //�׷��� ����� �� :  HashMap
     //HashMap<�����, HashMap<������, �Ÿ�>>
     HashMap<String, HashMap<String, Double>> distanceMap = 
           new HashMap<String, HashMap<String, Double>>();

     
     //������, �Ÿ� ����� �ӽ� �� : tempMap
     //tempMap�� ������ �̸� �ٽ� distanceMap�� put
     HashMap<String, Double> tempMap;

    
     //�׷��� �Է�
     tempMap = new HashMap<>();
     tempMap.put("�߾ӵ�����", 470.0);
     distanceMap.put("�����", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("�����", 470.0);
     tempMap.put("15", 160.0);
     distanceMap.put("�߾ӵ�����", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("�߾ӵ�����", 160.0);
     tempMap.put("�������п�", 30.0);
     tempMap.put("25", 144.0);
     tempMap.put("27", 58.0);
     distanceMap.put("15", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("15",30.0);
     distanceMap.put("�������п�", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("27", 80.0);
     tempMap.put("17", 86.0);
     tempMap.put("18", 154.0);
     tempMap.put("���̿��������", 55.0);
     distanceMap.put("16", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("��õ��", 9.0);
     tempMap.put("16", 86.0);
     tempMap.put("24", 56.0);
     distanceMap.put("17", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("17",9.0);
     distanceMap.put("��õ��", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("17", 56.0);
     tempMap.put("��������2", 134.0);
     tempMap.put("���Ǵ�", 80.0);
     tempMap.put("26", 69.0);
     distanceMap.put("24", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("24", 134.0);
     tempMap.put("���Ǵ�", 68.0);
     tempMap.put("��������", 84.0);
     tempMap.put("���̿����뿬����",60.0);
     distanceMap.put("��������2", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("24", 80.0);
     tempMap.put("��������2", 68.0);
     tempMap.put("���̿����뿬����", 43.0);
     distanceMap.put("���Ǵ�", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("���Ǵ�", 43.0);
     tempMap.put("23", 92.0);
     tempMap.put("��������2",60.0);
     tempMap.put("��������", 125.0);
     distanceMap.put("���̿����뿬����", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("��������2", 84.0);
     tempMap.put("23", 166.0);
     tempMap.put("����Ÿ��", 154.0);
     tempMap.put("���̿����뿬����", 125.0);
     distanceMap.put("��������", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("��������", 154.0);
     tempMap.put("23", 40.0);
     distanceMap.put("����Ÿ��", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("����Ÿ��", 40.0);
     tempMap.put("��������", 166.0);
     tempMap.put("���̿����뿬����", 92.0);
     tempMap.put("26", 100.0);
     tempMap.put("22", 134.0);
     distanceMap.put("23", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("22",60.0);
     distanceMap.put("IT����", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("21", 35.0);
     distanceMap.put("�۷ι�����", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("19", 26.0);
     distanceMap.put("��������1", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("20", 35.0);
     distanceMap.put("��������1", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("19", 102.0);
     tempMap.put("�۷ι�����", 35.0);
     tempMap.put("22", 28.0);
     distanceMap.put("21", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("21", 28.0);
     tempMap.put("IT����", 60.0);
     tempMap.put("20", 69.0);
     tempMap.put("23", 134.0);
     distanceMap.put("22", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("18", 59.0);
     tempMap.put("��������1", 35.0);
     tempMap.put("22", 69.0);
     distanceMap.put("20", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("25", 140.0);
     tempMap.put("��������1", 26.0);
     tempMap.put("��������2", 97.0);
     tempMap.put("18", 75.0);
     tempMap.put("21", 103.0);
     distanceMap.put("19", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("19", 75.0);
     tempMap.put("���̿��������",103.0);
     tempMap.put("16", 154.0);
     tempMap.put("20", 59.0);
     tempMap.put("26", 110.0);
     distanceMap.put("18", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("16", 55.0);
     tempMap.put("��������2", 37.0);
     tempMap.put("18", 103.0);
     distanceMap.put("���̿��������", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("���̿��������", 37.0);
     tempMap.put("19", 97.0);
     distanceMap.put("��������2", tempMap);

     tempMap = new HashMap<>();
     tempMap.put("19", 140.0);
     tempMap.put("15", 144.0);
     distanceMap.put("25", tempMap);
    
     tempMap = new HashMap<>();
     tempMap.put("24", 69.0);
     tempMap.put("23", 100.0);
     tempMap.put("18", 110.0);
     distanceMap.put("26", tempMap);
     
     tempMap = new HashMap<>();
     tempMap.put("15", 58.0);
     tempMap.put("16", 80.0);
     distanceMap.put("27", tempMap);
     
     
     
     Result  result = dijkstra(distanceMap,start); 
     
     
      distance = result.distances.get(destination);
     
  
     String curNode = destination;
     stops.add(destination);
     while(!result.preNode.get(curNode).isEmpty()){
        curNode = result.preNode.get(curNode);
        stops.add(curNode);
     }
     
   
     
    
     System.out.println(destination + "������ �ּ� �̵� �Ÿ�: " + distance);
     System.out.println("=====�̵� ���=====");
     for(int i = stops.size()-1; i>=0; i--){
        System.out.println(stops.get(i));
     }
     System.out.println("================");


     
    } //DijkstraAlgorithm(String start, String destination) ��ȣ��
    
   
    private static class Result{
         //��� ���� �ִ� �Ÿ�
         HashMap<String, Double> distances = new HashMap<>();
         //�ڱ� ������ ��� -> ��Ʈ ������
         HashMap<String, String> preNode = new HashMap<>();        
      }  //result



      //input: Map<�����, Map<������, �Ÿ�>>, ���� �����
      //output: Result object
      //do: dijkstra �˰����� �̿��Ͽ� ��������� �� ������ �ִ� �Ÿ�, ��Ʈ ���
      private static Result dijkstra(HashMap<String, HashMap<String, Double>> graph, String source){
         
         
      
         HashMap<String, Double> distances = new HashMap<>();
         HashMap<String, String> preNode = new HashMap<>();

         //������� �ִܰŸ��� 0, ���� ���� ����
         distances.put(source, 0.0);
         preNode.put(source, "");
         //�׷����� �� ��带 ������ ����
         HashSet<String> Q = new HashSet<>();

         //�׷��� ��带 Q�� ����
         //������� �ƴ� ��� distance, ���� ��� �ʱ�ȭ
         for(String key: graph.keySet()){
            Q.add(key);
            if(!key.equals(source)){
               distances.put(key, INFINITY);
               preNode.put(key, "");
            }
         }
         //Q�� ���� ���� �ݺ�
         while(!Q.isEmpty()){
            //���� Q�ȿ��� �ּ� distance�� node ã�� �� ������
            String minNode = "";
            double minNodeDistance = INFINITY;
            for(String node: Q){
               if(distances.get(node) < minNodeDistance){
                  minNode = node;
                  minNodeDistance = distances.get(node);
               }
            }
            Q.remove(minNode);

            //�Ÿ� �ּ� node�� �̿� ������ �Ÿ� Map �о� ����
            //�ּ� node ���� �Ÿ� + �̿� ������ �Ÿ� < ���� �̿� ����� �ּ� �Ÿ� �̸� distance, preNode ����
            HashMap<String, Double> minNodeMap = graph.get(minNode);
            for(String key: minNodeMap.keySet()){
               double distance = minNodeDistance + minNodeMap.get(key);
               if(distance < distances.get(key)){
                  distances.put(key, distance);
                  preNode.put(key, minNode);
               }
            }
         
      }  
         
         Result result = new Result();
         result.distances.putAll(distances);
         result.preNode.putAll(preNode);

         return result;

      
} // private static Result dijkstra(HashMap<String, HashMap<String, Double>> graph, String source) ����ȣ
      
      public double getDistance()
      {
      return distance;   
      }
      
      public ArrayList<String> getStops()
      {
         return stops;
      }
      
      
} //public class DijkstraAlgorithm ����ȣ