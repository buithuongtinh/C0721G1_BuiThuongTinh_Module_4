<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TỜ KHAI Y TẾ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<center>
    <h3>TỜ KHAI Y TẾ</h3>
    <h3>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ
        PHÒNG CHÓNG DỊCH</h3>
    <h6 class="text-danger justify-content-end">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật</h6>
</center>

<h3 class="text-danger"><c:if test="${msg!=null}">
    ${msg}
</c:if></h3>
<div class="container-fluid col-lg-12">
    <form:form modelAttribute="person" cssClass="row g-3" method="post" action="/save">
        <div class="col-12">
            <label for="inputEmail1" class="form-label">Họ tên(ghi chữ in hoa)</label>
            <form:input path="name" id="inputEmail1" cssClass="form-control"/>
        </div>
        <div class="col-md-4">
            <label for="inputEmail4" class="form-label">Năm sinh</label>
            <form:input path="year" id="inputEmail4" cssClass="form-control"/>
        </div>
        <div class="col-md-4">
            <label for="inputPassword4" class="form-label">Giới tính</label>
            <form:select path="gender" id="inputPassword4" cssClass="form-control">
                <form:option value="true">Nam</form:option>
                <form:option value="false">Nữ</form:option>
            </form:select>
        </div>
        <div class="col-md-4">
            <label for="inputAddress" class="form-label">Quốc tịch</label>
            <form:select path="nationality" id="inputAddress" cssClass="form-control">
                <form:option value="Việt Nam">Việt Nam</form:option>
                <form:option value="ABC">LÀo</form:option>
                <form:option value="ABC">Cam</form:option>
                <form:option value="ABC">Mỹ</form:option>
            </form:select>
        </div>
        <div class="col-12">
            <label for="inputAddress2" class="form-label">Số hộ chiếu hoặc CMND</label>
            <form:input path="idCard" id="inputAddress2" cssClass="form-control"/>
        </div>
        <div class="col-12">
            <label class="form-label">Thông tin đi lại</label>
            <br>
            <form:radiobutton path="transporter" value="Tàu bay" label="Tàu bay"/>
            <form:radiobutton path="transporter" value="Tàu thuyền" label="Tàu thuyền"/>
            <form:radiobutton path="transporter" value="Ô tô" label="Ô tô"/>
            <form:radiobutton path="transporter" value="Khác" label="Khác"/>
        </div>
        <div class="col-md-6">
            <label for="inputState" class="form-label">Số hiệu phương tiện </label>
            <form:input path="idTransport" id="inputState" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <label for="inputZip" class="form-label">Số ghế</label>
            <form:input path="seatNumber" id="inputZip" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <div class="form-check">
                <label for="date" class="form-label">Ngày khởi hành</label>
                <form:input path="startDay" id="date" cssClass="form-control"/>
            </div>
        </div>
        <div class="col-md-6">
            <label for="end" class="form-label">Ngày kết thúc </label>
            <form:input path="endDay" id="end" cssClass="form-control"/>
        </div>
        <div class="col-12">
            <label for="info" class="form-label">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố nào? </label><br>
            <form:textarea path="information" id="info" rows="3" cssClass="form-control"/>
        </div>
        <div class="col-12">
            <h4>Địa chỉ liên lạc</h4>
        </div>
        <div class="col-md-6">
            <label for="city" class="form-label">Quốc tịch</label>
            <form:select path="city" id="city" cssClass="form-control">
                <form:option value="Đà Nẵng">Đà Nẵng</form:option>
                <form:option value="ABC">Đồng Hới</form:option>
                <form:option value="ABC">HCM</form:option>
            </form:select>
        </div>
        <div class="col-md-6">
            <label for="district" class="form-label">Quận / huyện</label>
            <form:select path="district" id="district" cssClass="form-control">
                <form:option value="Hải Châu">Hải Châu</form:option>
                <form:option value="Thanh Khê">Thanh Khê</form:option>
                <form:option value="ABC">DND</form:option>
                <form:option value="ABC">Quận 1</form:option>
            </form:select>
        </div>
        <div class="col-12">
            <label for="address" class="form-label">Địa chỉ nơi ở</label>
            <form:input path="address" id="address" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <label for="phone" class="form-label">Điện thoại</label>
            <form:input path="phoneNumber" id="phone" cssClass="form-control"/>
        </div>
        <div class="col-md-6">
            <label for="email" class="form-label">Email</label>
            <form:input path="email" id="email" cssClass="form-control"/>
        </div>
        <table>
            <tr>
                <th>Triệu chứng</th>
                <th>Có</th>
                <th>Không</th>
            </tr>
            <tr>
                <td>Sốt</td>
                <td><form:checkbox path="symptom" value="Sốt"/></td>
                <td><input class="form-check-input" type="checkbox" value=""></td>
            </tr>
            <tr>
                <td>Ho</td>
                <td><form:checkbox path="symptom" value="Ho"/></td>
                <td><input class="form-check-input" type="checkbox" value=""></td>
            </tr>
            <tr>
                <td>Khó thở</td>
                <td><form:checkbox path="symptom" value="Khó thở"/></td>
                <td><input class="form-check-input" type="checkbox" value=""></td>
            </tr>
            <tr>
                <td>Đau họng</td>
                <td><form:checkbox path="symptom" value="Đau họng"/></td>
                <td><input class="form-check-input" type="checkbox" value=""></td>
            </tr>
        </table>
        <h6 class="text-danger justify-content-end">Ấn nút gửi là hiểu và đã đông ý</h6>
        <div class="col-12">
            <center><input type="submit" value="Gửi tờ khai"></center>
        </div>
    </form:form>
</div>
</body>
</html>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>