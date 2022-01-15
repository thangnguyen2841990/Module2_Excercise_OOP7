package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int choice = -1;
        DocumentManagement documentManagement = new DocumentManagement();
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice > 3) {
                System.out.println("chọn lại Menu!!!!");
            }
            switch (choice) {
                case 1: {
                    documentManagement.displayBooks();
                    documentManagement.displayMagazines();
                    documentManagement.displayNewsPaper();
                    break;
                }

                case 2: {
                    System.out.println("----Nhập thông tin mới cho tài liệu");
                    System.out.println("1. Sách.");
                    System.out.println("2. Tạp chí");
                    System.out.println("3. Báo");
                    System.out.println("Bạn hãy lụa chọn: ");
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1: {
                            System.out.println("---Thêm Sách---");
                            Book newBook = inputNewBook();
                            documentManagement.addNewBook(0, newBook);
                            break;
                        }
                        case 2: {
                            System.out.println("---Thêm Tạp chí---");
                            Magazine newMagazine = inputNewMagazine();
                            documentManagement.addNewMagazine(0, newMagazine);
                            break;
                        }
                        default: {
                            System.out.println("---Thêm nhân viên---");
                            NewsPaper newsPaper = inputNewPaper();
                            documentManagement.addNewNewsPaper(0, newsPaper);
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("----Tìm kiếm tài liệu theo tên----");
                    System.out.println("Nhập mã số tài liệu cần tìm: ");
                    int documentCode = scanner.nextInt();
                    documentManagement.findDocument(documentCode);
                    break;
                }
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("----MENU QUẢN LÝ TÀI LIỆU----");
        System.out.println("1. Hiển thị tất cả tài liệu");
        System.out.println("2. Nhập thông tin  tài liệu mới");
        System.out.println("3. Tìm kiếm tài liệu theo mã số");
        System.out.println("4. Thoát");
    }

    public static Book inputNewBook() {
        System.out.println("Mã tài liệu: ");
        int documentCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tên nhà xuát bản: ");
        String imprint = scanner.nextLine();
        System.out.println("Số bản phát hành: ");
        int releaseNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tên tác giả: ");
        String nameOfWriter = scanner.nextLine();
        System.out.println("Tổng số trang: ");
        int totalPages = scanner.nextInt();
        return new Book(documentCode,imprint,releaseNumber,nameOfWriter,totalPages);
    }

    public static Magazine inputNewMagazine() {
        System.out.println("Mã tài liệu: ");
        int documentCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tên nhà xuát bản: ");
        String imprint = scanner.nextLine();
        System.out.println("Số bản phát hành: ");
        int releaseNumber = scanner.nextInt();
        System.out.println("Số phát hành: ");
        int issueNumber = scanner.nextInt();
        System.out.println("Tháng phát hành: ");
        int releaseMonth = scanner.nextInt();
        return new Magazine(documentCode,imprint,releaseNumber,issueNumber,releaseMonth);

    }

    public static NewsPaper inputNewPaper() {
        System.out.println("Mã tài liệu: ");
        int documentCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tên nhà xuát bản: ");
        String imprint = scanner.nextLine();
        System.out.println("Số bản phát hành: ");
        int releaseNumber = scanner.nextInt();
        System.out.println("Ngày phát hành: ");
        int releaseDate = scanner.nextInt();
        return new NewsPaper(documentCode,imprint,releaseNumber,releaseDate);
    }

}
