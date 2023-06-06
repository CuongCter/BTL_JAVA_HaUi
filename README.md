# LapTrinhJava_09

Tập tin GUI sử dụng để lưu các file giao diện.
FileData sử dụng để lưu các file dữ liệu.
CSDL sử dụng để lưu các class.
Sử dụng phần mềm NetBeans để chạy project và dùng swing để làm giao diện.

### Quản lý ký túc xá

1. Mặc định có 2 tầng, mỗi tầng có 3 phòng, mỗi phòng có thể chứa tối đa 6 sinh viên:

- PhongKTX: tên, mã, loại, số sv đang ở, số sv tối đa, tầng và ds các sinh viên (SinhVienKTX)

- SinhVienKTX extends SinhVien: msv, tên, giới tính, ngày sinh, sdt, quê quán, ngày đăng ký, ngày hết hạn

2. Hiện tại còn các chức năng sau chưa hoàn thiện:

- Thêm sinh viên: tìm kiếm theo mã sinh viên (lấy dữ liệu từ file sinhvien.txt) sau đó upload vào file KyTucXa.txt

3. Đã hoàn thành chức năng:

   1. Xóa: (xóa sinh viên ra khỏi phòng ktx)

   - Chọn 1 hoặc nhiều sv trong table: sau đó kích nút xóa

   2. Sửa thông tin sinh viên trong phòng ktx: Chỉ cho phép gia hạn thêm ngày ở (Sửa ngày hết hạn)

   - Chọn 1 sv trong bảng sau đó kích nút Gia hạn

   3. Cập nhật file dữ liệu txt sau khi sửa, xóa sinh viên

   4. Sửa thông tin phòng ký túc xá: Sửa loại phòng và số sinh viên tối đa có thể ở
