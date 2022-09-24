package ru.mirea.lab6;

public class TestStudentSort {
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(l,r,a);
    }

    public static void merge(Student[] A, Student[] B, Student[] C){
        int a = 0;
        int b = 0;
        int k = 0;
        if(A.length == 0){
            for(int  i = 0; i < B.length; i++){
                C[i] = B[i];
            }
        }

        if(B.length == 0){
            for(int  i = 0; i < A.length; i++){
                C[i] = A[i];
            }
        }

        while(a + b < A.length + B.length){
            if((b >= B.length) || ((a < A.length) && (A[a].getId() <= B[b].getId()))){
                C[k++] = A[a++];
            }
            else{
                C[k++] = B[b++];
            }
        }
    }

    public static void exec(){
        Student nika = new Student(19, "Nika", 826123);
        Student misha = new Student(18, "Misha", 545622);
        Student anya = new Student(25, "Anya", 123423);
        Student roma = new Student(18, "Roma", 324123);
        Student kate = new Student(23, "Katya", 898321);
        Student vlad = new Student(18, "Vlad", 459127);
        Student petya = new Student(21, "Petya", 769361);
        Student vera = new Student(22, "Vera", 634502);
        Student nikita = new Student(19, "Nikita", 777777);
        Student sasha = new Student(18, "Sasha", 123123);

        Student[] firstPart = {nika, misha, anya, roma};
        Student[] secondPart = {kate, vlad, petya, vera, nikita, sasha};
        Student[] commonList = new Student[firstPart.length + secondPart.length];

        System.out.println("Первая неотсортированная партия студентов: ");
        for(int i = 0; i < firstPart.length; i++){
            System.out.println(firstPart[i]);
        }

        System.out.println("Вторая неотсортированная партия студентов: ");
        for(int i = 0; i < secondPart.length; i++){
            System.out.println(secondPart[i]);
        }

        System.out.println("Первая отсортированная по id партия студентов: ");
        mergeSort(firstPart, firstPart.length);
        for(int i = 0; i < firstPart.length; i++){
            System.out.println(firstPart[i]);
        }

        System.out.println("Вторая отсортированная по id партия студентов: ");
        mergeSort(secondPart, secondPart.length);
        for(int i = 0; i < secondPart.length; i++){
            System.out.println(secondPart[i]);
        }

        System.out.println("Общий отсортированный список студентов: ");
        merge(firstPart, secondPart, commonList);
        for(int i = 0; i < commonList.length; i++){
            System.out.println(commonList[i]);
        }

    }
}
