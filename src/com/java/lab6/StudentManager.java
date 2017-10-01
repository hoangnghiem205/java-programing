package com.java.lab6;

public class StudentManager {

    private static final int MAX = 20;
    private Student[] listStudents;
    private int size;

    public StudentManager() {
        listStudents = new Student[MAX];
        size = 0;
    }

    /**
     *
     * THÊM MỚI HỌC VIÊN
     *
     * @param stud thông tin học viên mới
     * @return
     *  - true: thêm mới thành công
     *  - false: thêm mới thất bại
     */
    public boolean add(Student stud) {
        if (size < MAX) {
            listStudents[size] = stud;
            size++;
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * TÌM KIẾM THEO TÊN VÀ HIÊN THỊ KẾT QUẢ
     *
     * @param name: tên học viên muốn tìm
     */
    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (listStudents[i].getName().equals(name)) {
                found = true;
                System.out.println(listStudents[i].getEmail()
                        + " | " + listStudents[i].getAge());
                break;
            }
        }
        if (!found) { // found == false
            System.out.println("Khong tim thay");
        }
    }

    /**
     *
     * IN RA DANH SACH HOC VIÊN TRONG LỚP
     *
     */
    public void list() {
        for (int i = 0; i < size; i++) {
            System.out.println(listStudents[i].getName());
        }
    }

    /**
     *
     * IN RA DANH SÁCH HỌC VIÊN TRONG LỚP THEo
     * THỨ TỰ
     *
     * @param order : thứ tự sắp xếp
     *              - true: A-Z
     *              - false: Z-A
     */
    public void list(boolean order) {

        if (order) { // order == true
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (listStudents[i].getName()
                            .compareTo(listStudents[j].getName()) > 0) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                }
            }
            list();
        } else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (listStudents[i].getName()
                            .compareTo(listStudents[j].getName()) < 0) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                }
            }
            list();
        }


    }

}
