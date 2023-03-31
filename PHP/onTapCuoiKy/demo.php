<!DOCTYPE html>
<html>
<head>
<style>
.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.desc {
  padding: 15px;
  text-align: center;
}
</style>
</head>
<body>

<h2>Dropdown Image</h2>
<p>Move the mouse over the image below to open the dropdown content.</p>

<div class="dropdown">
  <img src="images/cuoi_1.jpg" alt="" width="100" height="50">
  <div class="dropdown-content">
      <img src="images/cuoi_1.jpg" alt="" width="300" height="200">
      <div class="desc">Beautiful Cinque Terre</div>
      <option value="ok">pls click me</option>
      <img src="images/cuoi_2.jpg" alt="" width="300" height="200">
      <div class="desc">Beautiful Cinque Terre</div>
      <img src="images/cuoi_3.jpg" alt="" width="300" height="200">
      <div class="desc">Beautiful Cinque Terre</div>
      <img src="images/cuoi_7.jpg" alt="" width="300" height="200">
      <div class="desc">Beautiful Cinque Terre</div>
      <img src="images/cuoi_8.jpg" alt="" width="300" height="200">
      <div class="desc">Beautiful Cinque Terre</div>
    </div>
</div>


<select name="" id="">
    <option value="1">adaw</option>
    <option value="2">awdaw</option>
    <option value="3">awdawd</option>
</select>
</body>
</html>