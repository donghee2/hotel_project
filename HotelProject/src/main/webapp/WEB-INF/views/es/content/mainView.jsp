<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="hold-transition skin-yellow sidebar-mini">
  <div class="wrapper">
    <div class="content-wrapper">
      <!-- Content Header (Page header) -->
      <section class="content-header">
        <h1>Hotel Statistics</h1>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
        </ol>
      </section><!-- Main content -->
      <section class="content">
        <div class="row">
          <div class="col-12">
            <!-- DONUT CHART -->
            <div class="box">
              <div class="box-header with-border">
                <h3 class="box-title">Sales Report</h3>
                <div class="box-tools pull-right"></div>
              </div>
              <div class="row px-3">
                <div class="col-12 col-lg-7">
                  <div class="box-body chart-responsive">
                    <div class="chart" id="sales-chart" style="height: 300px; position: relative;"></div>
                  </div>
                </div><!-- /.box-body -->
                <div class="col-12 col-lg-5">
                  <ul class="chart-legend clearfix pt-30">
                    <li>
                      <h5><i class="fa fa-circle-o text-red"></i>In-Store Sales</h5>
                    </li>
                    <li>
                      <h5><i class="fa fa-circle-o text-purple"></i>Download Sales</h5>
                    </li>
                    <li>
                      <h5><i class="fa fa-circle-o text-green"></i>Mail-Order Sales</h5>
                    </li>
                  </ul>
                </div>
              </div>
            </div><!-- /.box -->
          </div><!-- /.col (LEFT) -->
          <div class="col-12">
            <!-- AREA CHART -->
            <div class="box">
              <div class="box-header with-border">
                <h3 class="box-title">Revenue Statistics</h3>
                <div class="box-tools pull-right"><button type="button" class="btn btn-box-tool"
                    data-widget="collapse"><i class="fa fa-minus"></i></button><button type="button"
                    class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button></div>
              </div>
              <div class="box-body chart-responsive">
                <div class="chart" id="revenue-chart" style="height: 300px;"></div>
              </div><!-- /.box-body -->
            </div><!-- /.box -->
          </div>
          <div class="col-12">
            <!-- LINE CHART -->
            <div class="box">
              <div class="box-header with-border">
                <h3 class="box-title">Analatics</h3>
                <div class="box-tools pull-right"><button type="button" class="btn btn-box-tool"
                    data-widget="collapse"><i class="fa fa-minus"></i></button><button type="button"
                    class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button></div>
              </div>
              <div class="box-body chart-responsive">
                <div class="chart" id="line-chart" style="height: 300px;"></div>
              </div><!-- /.box-body -->
            </div><!-- /.box -->
          </div>
          <div class="col-12">
            <!-- BAR CHART -->
            <div class="box">
              <div class="box-header with-border">
                <h3 class="box-title">Download Count</h3>
                <div class="box-tools pull-right"><button type="button" class="btn btn-box-tool"
                    data-widget="collapse"><i class="fa fa-minus"></i></button><button type="button"
                    class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button></div>
              </div>
              <div class="box-body chart-responsive">
                <div class="chart" id="bar-chart" style="height: 300px;"></div>
              </div><!-- /.box-body -->
            </div><!-- /.box -->
          </div><!-- /.col (RIGHT) -->
        </div><!-- /.row -->
      </section><!-- /.content -->
    </div><!-- /.content-wrapper -->
    
  </div><!-- ./wrapper -->
  
  <!-- Morris.js charts -->
  <script src="../admin_resource/assets/vendor_components/raphael/raphael.min.js"></script>
  <script src="../admin_resource/assets/vendor_components/morris.js/morris.min.js"></script>
  <script src="../admin_resource/js/pages/widget-morris-charts.js"></script>
</body>
</html>