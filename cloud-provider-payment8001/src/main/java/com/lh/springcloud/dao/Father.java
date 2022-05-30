package com.lh.springcloud.dao;

import com.lh.springcloud.entities.Ting;
import com.lh.springcloud.entities.TingImpl;


import java.lang.reflect.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Father {
//    public Father(){
//        Son son = new Son();
//    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Father father = new Father();
//        System.out.println(father);
//        System.out.println(father.getThis());
//        System.out.println(father == father.getThis());
//        List<Integer> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        System.out.println(Father.class);
//        System.out.println(father.getClass());
//        System.out.println(list1.getClass() == list2.getClass());


//        Class<? extends Father> aClass = father.getClass();
//        Class<Father> fatherClass = Father.class;
//
//        Method[] methods = fatherClass.getDeclaredMethods();
//        for (Method method : methods) {
//            method.setAccessible(true);
//            if (method.getName().equals("aa") && method.getParameterCount() == 1){
//                method.invoke(father, "dddddddeeeeeeeee");
//            }
//            System.out.println(method.getName());
//        }
//        methods[0].setAccessible(true);
//        Method aa = fatherClass.getDeclaredMethod("aa", String.class);
//        aa.setAccessible(true);
//        aa.invoke(father, "ddddd");
//        System.out.println(Modifier.PRIVATE);


//        TingImpl ting1 = new TingImpl();
//        Ting ting = (Ting)Proxy.newProxyInstance(TingImpl.class.getClassLoader(), TingImpl.class.getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////                System.out.println(proxy);
////                System.out.println(method);
////                for (Object arg : args) {
////                    System.out.println(arg.toString());
////                }
//                System.out.println(proxy.toString());
//                System.out.println("做饭");
//                Object invoke = method.invoke(ting1, args);
//                return invoke;
//            }
//        });
//        ting.eating("ddd");

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//        List<Integer> collect = list.stream().sorted((p1, p2) -> (p2 - p1)).limit(3).collect(Collectors.toList());
//        for (Integer integer : collect) {
//            System.out.println(integer);
//        }
////        FF ff = new FF();
//        System.out.println(FF.class);
//
//        byte[] array2={97,98,99};
//        String str3=new String(array2);
//        System.out.println(str3);

//        String temp = "temp,";
//
//        String[] split = temp.split(",");
//        System.out.println(split.length);
//        for (String s : split) {
//            System.out.println(s);
//        }
//        int i = Integer.parseInt("2");
//        System.out.println(i);
//        List<String> list = new LinkedList<>(Arrays.asList(temp.split(",")));
//        list.remove("temp");
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//        List<String> list1 = Arrays.asList(temp.split(","));
//        list1.remove("0");
//        for (String s : list1) {
//            System.out.println(s);
//        }
//
//        System.out.println();
//        StringBuilder sb = new StringBuilder();

//        char[] chars = new char[]{'a','b','c'};
//        Arrays.sort(chars);
//        String key = new String(chars);
//        String key2 = new String(chars);
////        System.out.println(key);
////        System.out.println(key2 == key);
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put(key, 1);
//        hashMap.put(key2, 2);
////        hashMap.values()
//        Set<String> keySet = hashMap.keySet();
//        for (String s : keySet) {
//            System.out.println(s);
//        }
////        key.toCharArray()
//        System.out.println(hashMap.get(key));
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(new ArrayList<>(Arrays.asList(1, 2, 2)));

//        TreeNode ans = new TreeNode(2);
//        ans.left = new TreeNode(1);
//        ans.right = new TreeNode(3);
//        String serialize = serialize(ans);
//        System.out.println(serialize);
//        TreeNode node = deserialize(serialize);
//        System.out.println(node.val);
//        System.out.println(node.left.val);
//        System.out.println(node.right.val);

//        String s = validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:");
//        System.out.println(s);

//        String s = ":243:::fd:";
//        String[] split = s.split(":");
//        System.out.println(split.length);
//        for (String s1 : split) {
//            System.out.println(s1);
//        }

        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        stack.pop();
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }

    public static String validIPAddress(String queryIP) {
        String[] strip4 = queryIP.split("\\.");
        int len4 = strip4.length;
        if(len4 == 4){
            for(String str : strip4){
                int len = str.length();
                if(len > 3 || (len != 1 && str.charAt(0) == '0')){
                    return "Neither";
                }
                int check = 0;
                for(int i = 0; i < len; i++){
                    char cur = str.charAt(i);
                    if(cur < '0' || cur > '9'){
                        return "Neither";
                    }
                    check += (cur - '0') * Math.pow(10, (len - i - 1));
                }
                if(check > 255){
                    return "Neither";
                }
            }
            return "IPv4";
        }
        String[] strip6 = queryIP.split(":");
        int len6 = strip6.length;
        if(len6 == 8){
            for(String str : strip6){
                int len = str.length();
                if(len > 4){
                    return "Neither";
                }
                for(int i = 0; i < len; i++){
                    char cur = str.charAt(i);
                    if(!(cur <= '9' && cur >= '0' || cur <= 'f' && cur >= 'a' || cur <= 'F' && cur >= 'A')){
                        return "Neither";
                    }
                }
                return "IPv6";
            }
        }
        return "Neither";
    }

//    public static String serialize(TreeNode root) {
//        if(root == null){
//            return null;
//        }
//        StringBuilder sb = new StringBuilder();
//        sb.append(root.val);
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root.left);
//        queue.offer(root.right);
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            sb.append("|");
//            for(int i = 0; i < size; i++){
//                root = queue.poll();
//                if(root != null){
//                    queue.offer(root.left);
//                    queue.offer(root.right);
//                    if (i != 0) {
//                        sb.append(",");
//                    }
//                    sb.append(root.val);
//                }else{
//                    if (i != 0) {
//                        sb.append(",");
//                    }
//                    sb.append("null");
//                }
//            }
//        }
////        return sb.toString();
//    }

//    public static TreeNode deserialize(String data) {
//        String[] rows = data.split("\\|");
//        TreeNode ans = new TreeNode(Integer.parseInt(rows[0]));
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(ans);
//        for(int i = 1; i < rows.length; i++){
//            int size = queue.size();
//            String[] vals = rows[i].split(",");
//            for(int j = 0; j < size; j++){
//                TreeNode cur = queue.poll();
//                if(!vals[2 * j].equals("null")){
//                    TreeNode t = new TreeNode(Integer.parseInt(vals[2 * j]));
//                    cur.left = t;
//                    queue.offer(t);
//                }
//                if(!vals[2 * j + 1].equals("null")){
//                    TreeNode t = new TreeNode(Integer.parseInt(vals[2 * j + 1]));
//                    cur.right = t;
//                    queue.offer(t);
//                }
//            }
//        }
//        return ans;
//    }



    public Object getThis(){
        return this;
    }
    private void aa(String aaa){
        System.out.println(aaa);
    }
    private void aa(){
        System.out.println("aaa");
    }
    static class FF{
       int a = 0;
    }
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
