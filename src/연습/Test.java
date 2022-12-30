package 연습;

import java.util.LinkedList;

class HashTable {
    class Node { // 해시테이블에 저장할 데이터를 노드에 담는다
        String key; // 검색
        String value; // 검색 결과
        public Node(String key, String value) {
            this.key = key;
            this.value = value; // key,value를 받아서 객체에 할당
        }
        String value() {
            return value;
        }
        void value(String value) {
            this.value = value;
        } // value를 가져오는 get,set
    }
    LinkedList<Node>[] data; // 데이터를 저장할 링크드리스트를 배열로 선언
    HashTable(int size) {
        this.data = new LinkedList[size]; // 크기를 정해서 배열 방으로 만들었다
    }
    int getHashCode(String key) {
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c; // 아스키값을 가져와서 해시코드에 더해준
        }
        return hashcode; // 해시코드 반환
    }
    int covertToIndex(int hashcode) { // 배열에 인덱스로 정의
        return hashcode % data.length; // 해시코드를 배열방의 크기로 나눈 나머지가 배열방의 인덱스가 된다
    }
    Node searchKey(LinkedList<Node> list, String key) {
        // 노드가 여러개 존재하는 경우 key를 가지고 해당 노드 찾아노는 함수
        if (list == null) return null;
        for (Node node : list) {
            if (node.key.equals(key)) {
                return node; // 같으면 노드 반환
            }
        }
        return null;
    }
    void put(String key, String value) {
        int hashcode = getHashCode(key); // key를 가지고 해시코드를 받아옴
        int index = covertToIndex(hashcode); // 받아온 해시코드로 저장할 배열방 번호를 받아옴
        LinkedList<Node> list = data[index]; // 배열 방 번호를 이용해서 기존 배열 방에 있는 데이터를 가져옴
        if (list == null) {
            list = new LinkedList<Node>(); // null이면 배열방 생성
            // 해당 리스트를 배열방에 넣어줌
            data[index] = list;
        }
        // 배열방에 기존 해당키로 데이터를 가지고 있는지 노드를 받아옴
        Node node = searchKey(list, key);
        if (node == null) {
            // 데이터가 없다는 뜻이기 때문에 노드객체 생성
            list.addLast(new Node(key, value));
        } else {
            node.value(value); // 해당 노드 대체. 중복키 처리
        }
    }
    String get(String key) {
        int hashcode = getHashCode(key);
        int index = covertToIndex(hashcode); // 받아온 해시코드로 인덱스를 받아옴
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not found" : node.value();
    }
}
public class Test{
    public static void main(String[] args){
        HashTable h = new HashTable(3);
        h.put("sung","She is pretty");
        h.put("jin","She is Good");
        h.put("hee","She is cute");
        h.put("min","She is model");
        System.out.println(h.get("sung"));
        System.out.println(h.get("jin"));
        System.out.println(h.get("hee"));
        System.out.println(h.get("min"));
    }
}
