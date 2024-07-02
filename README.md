
# Đồ Án Quản Lý Sinh Viên

## Mục Lục

1. [Giới Thiệu](#giới-thiệu)
2. [Yêu Cầu Hệ Thống](#yêu-cầu-hệ-thống)
3. [Kiến Trúc Hệ Thống](#kiến-trúc-hệ-thống)
4. [Thiết Kế UML](#thiết-kế-uml)
5. [Cài Đặt và Chạy Ứng Dụng](#cài-đặt-và-chạy-ứng-dụng)
6. [Công Nghệ Sử Dụng](#công-nghệ-sử-dụng)
7. [Tài Liệu Tham Khảo](#tài-liệu-tham-khảo)

## Giới Thiệu

Đồ án quản lý sinh viên nhằm xây dựng một hệ thống quản lý hồ sơ sinh viên, điểm số, khóa học. Hệ thống bao gồm các chức năng chính như đăng nhập, đăng xuất, phân quyền, quản lý hồ sơ học sinh chi tiết và bảo mật, quản lý điểm số, lịch học và các hoạt động.

## Yêu Cầu Hệ Thống

- **Người dùng hệ thống:**
    - Quản trị viên

- **Chức năng:**
    - Đăng nhập, đăng xuất
    - Quản lý hồ sơ sinh viên chi tiết
    - Quản lý điểm số
    - Quản lý khoa học
    - Thống kê dữ liệu

## Kiến Trúc Hệ Thống

Hệ thống được xây dựng trên nền tảng J2EE với các công nghệ chính như Spring Core, Spring MVC, Spring Boot. Dữ liệu được lưu trữ và quản lý bằng JDBC và Hibernate trong hệ quản trị cơ sở dữ liệu quan hệ.

## Thiết Kế UML

Dưới đây là sơ đồ UML của hệ thống:



[Open UML Diagram in draw.io](
https://app.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1#R%3Cmxfile%3E%3Cdiagram%20name%3D%22Page-1%22%20id%3D%22lbzm9UDLgTXxXJGvuryF%22%3E7Z1bc5s4FMc%2FjWd2H7JjbjZ%2BjJ22e0m63bqZ7j7tKKDYNIC8IGq7n34lI%2FnCzVA7CLtnxpMJxwKE9EM6%2F3NA7hmTYPUuQov5A3Gx39P77qpn3PV0fTSy2V9uWKeG4VBPDbPIc1OTtjNMvW9YGPvCmngujg8KUkJ86i0OjQ4JQ%2BzQAxuKIrI8LPZM%2FMOzLtAM5wxTB%2Fl562fPpfPUalv9nf1X7M3m8sxaX3wTIFlYGOI5cslyz2S86RmTiBCa%2FhesJtjnbSfbJd3vbcm324pFOKR1dvjX%2BW%2Fy2XqwhtoX690wsf5cvzg34ihfkZ%2BIC2ZbjzGOevxosuZ0LZsjXnqBj0K2NX4mIZ2Kb%2Fps25l7vnuP1iTh1Ykpcl7k1nhOIu8bK4989pXGDOzriIreNvoHJaZ8T3HMCMeszAd5jVrG9IBWBwXvUUxlbYjvo0XsPW3qx3cMUDTzwjGhlASi0HLuUTxdIIeXWTJ%2BeUVoICuZb2HZXDiieLVnEi3%2BDpMA02jNiohvdQmKwN%2B0rXR7uYNJM0WZ%2BT5IsvGRAHi2Pfauj9k%2FopsbdLme6%2FIbXv6W2e5JOCvpeHa9dNNvEXnBE%2BKTiNlDkpLg%2BX7GhHxvFrJNHz%2Fz3XiDeeymuhXmwHNdfuRxzBrfC2f3m2J35s7yUTQFNxG2%2B7O%2FuXfmbEfMjjBeEC%2Bkm6axxuzDKjzp%2F2L1LFbXCdvWdtvsw4tHdEJCVn3kbToTM1SWmOMyjghFFD1tQW5MReWddRwVgYbRr0eG8VpgGEVjwU3CBoMQBTglZEojjzMCdLRMx0A1HWZ%2B2FigOF6SyAU0lKIxahGN5YQs75dv8ZvHZd9zZl8%2B%2FeG8L3AipjRx%2BVWCB3GyBzGyDz2IoV6zu7VRRX%2BL031kLjMKZ%2BwKd%2Bc7PJ0xzJ%2FOrgEX8imfNygekyR04xxj2wv9fuzyjgyfr%2BIUvd%2FApTllZKq8zzvp0hTWuNilAXdGORltujOFNbbz7gxyXTYJxECGUjKUezPDPBk4QJ5%2FyAXMKEro0Op6P6%2BGR4EOcslTCscd83ckGn1gRBUjVk1GzNdiZFTkdqSfWzfwQgiunkUamZngqta3a%2Fb81WsjmT7JIci8HAZgkTqCoerkoWpUm%2BCuCCStMAHEOQlQiGaYp4Lin34GOlTQoVwkaQW5opSLCUmiGG%2FIACxaxkK5QtKKwyopGVOHRFgOGTCtKCFEvUrSCmSS5GOO3cTPIAKsKGNFuVrSrHK5lH7S2aacEhBOzYRTJqWkWXU9jcqnUq5CNw3K%2FGFnw2CJcIKx6yyRHqs2yJ3RT%2Flo8QEv73OpJuBEASfKlZReOMfduDh2Im9BPRJC2kktIspVlV4Wisl8NgKrcuIBd6iZO6Rtx4fGz9hYFTRcgz%2Bk5yNAW%2B5uYk4ieESvOIw1YLkrHpFeGBzqwZNZ3eJEuUek5Z%2FA2Y4pIptOkicfAx9K%2BFDvDuUjiGUyHOhomw71AebhKNfv2J1h6euyNpyTGQmR%2F2ZnZc3H%2FCTsisbblbknZCGa7AumdC18XpRQUtPZjBmWDq5qYxFYYi71DFd1hiUK8qup7IoI%2B4h6X%2FFBPc5%2FG5YFxMo%2BMr5%2FzBcEkdJMpIwyosEsEA0%2FqEYpi8Gl%2FkSKY6VMAQ%2Fj9DlkUBvoziiVQg%2F0iFIBWtTQolyv6IUPdR5NCwEpbZOiXLnIA2dIoZ5MBX1i%2FzG3JVgAIUoI6YB6sVSoF7zy6N98d9Zf6dY%2F4mD8%2F7vV%2FsZabHy%2F4jHkci17iqfqheeOCB5Z7dqCh31uEzpn7cNuPJ7Jm%2BLoq%2BeAADqzAMrmaOqO81f%2FzIpRlaPxCeup4kftwEE5x%2FRjNA6eKRc%2BRlmKRgDDBposMUBJ25QoFzxGSQB%2Bjp2XDzgKvDhmkx2AohoU5XpnaP4AzmxB%2BP4CnFl7qKJrztvMVY%2B5d6SZjaZJEv5aXZlMAKVwqlLYLh7a%2FL3ga8%2BVGBW5kt7m7WCXs1kqGGB6P3F6v7w0iVGaJnGxjyku4QVIaZsU9YqhOEWSLFxUigmQooAU5ZJBniw%2FpjC3r4gUYKRtRjqQJBlclngxCxIeVSsadUS8yGo3SXiI9V1BwryWhBllsh0js%2BbdePUKxqzIdggFI%2BiErMfrzSdm4zClch1jlr6YkuqYcmoAlrZhUS5lzOLkRyplKscXgKVtWNSrmbIFTLiaAVg6BUsHZM2F5WTMujkZ%2Bc59R3SNbV9pO3cr92U2zX315HpOoB5rDn3NF8aVA1rzBZ6uXj4eT4CldFapR5i5T5%2B5Ly8RZh5JhJVyA6y0zYp6%2FViVCjsywAAubeOiXEHKWbdQQQIuHcOlAxrywrSNVTc1Jo%2FYEXEzyt9f19HO3dKQstqNUpB8oaAKCQmK8rxL5GV%2Fa6X2utFXLyktvZLeTUaSw3pEUcJUfvJUbjUOBysXldaxrGQlOQBM28AoV5ZWZWby2DgDwLQNjHptWZmdhOGlU7Sol5b2hS2sZylLm212vY0itN4rIJjcHfkDN%2Bzc2oFc%2BmP7btLA2u%2Bz4ztolpXp5LQO5%2FVpvyOrJ1f%2Bqy%2FKQJedqsuGGVlm114V4%2BpVWXWiryeFWcosaLNXnwsvL%2BFnHUn41YEHsGkbG%2FUKrSr3B8x0kRnlIk1CWyLSjjADwLQNTAd0Wr7fO63TBnpNnWZ0awF0W7vWdu5WqtXWr7SdzY61s5LVmlpoZ6tj7Xxhby%2FX57lb47Osd%2B1I1R13IFBcMz4FIapinhqs25p9csCo%2FeSAXuE8XUOMalCYy%2BttlpUPQ3Zl298F%2Ff1uPAHP%2F%2Fye%2F3b0uJyo1KD4p2TxCjsJxX8lOFqDUOwMLsqjUYPSXzQXxDxu4lKw4I5qUpTHoGzjwjzWzv2kGtuMCKH7TgLjZ%2F5AXMxL%2FA8%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E)
## Cài Đặt và Chạy Ứng Dụng

### Yêu cầu:
- JDK 8 hoặc cao hơn
- Maven 3.6.0 hoặc cao hơn
- MySQL 5.7 hoặc cao hơn

### Các bước cài đặt:
1. Clone repository:
   ```bash
   git clone https://github.com/yourusername/student-management-system.git
   cd student-management-system

2.Cấu hình database:

- Tạo một database mới trong MySQL.

- Cập nhật thông tin kết nối database trong file application.properties.
Build và chạy ứng dụng

3. Clone repository:
   ```bash
   mvn clean install
   mvn spring-boot:run

4.Truy cập ứng dụng:

Mở trình duyệt và truy cập http://localhost:8080.


### Công Nghệ Sử Dụng
- Spring Framework: Sử dụng Spring Core, Spring MVC, và Spring Boot để xây dựng các thành phần của hệ thống.
- JDBC và Hibernate: Quản lý kết nối và thao tác với cơ sở dữ liệu.
- MySQL: Hệ quản trị cơ sở dữ liệu quan hệ.
- Thymeleaf: Công cụ template engine cho Spring MVC.
- Maven: Công cụ quản lý dự án và các phụ thuộc.
 ### Tài Liệu Tham Khảo
 - [Spring Framework Documentation](https://spring.io/projects/spring-framework)
 - [Hibernate Documentation](https://hibernate.org/orm/documentation/6.5/)
 - [Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)
 - [Maven Documentation](https://maven.apache.org/guides/index.html)



