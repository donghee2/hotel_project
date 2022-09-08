(function(c,a){if(typeof define==="function"&&define.amd){define(["moment","jquery"],function(e,d){return(c.daterangepicker=a(e,d))})}else{if(typeof module==="object"&&module.exports){var b=(typeof window!="undefined")?window.jQuery:undefined;if(!b){b=require("jquery");if(!b.fn){b.fn={}}}module.exports=a(require("moment"),b)}else{c.daterangepicker=a(c.moment,c.jQuery)}}}(this,function(c,a){var b=function(f,k,d){this.parentEl="body";this.element=a(f);this.startDate=c().startOf("day");this.endDate=c().endOf("day");this.minDate=false;this.maxDate=false;this.dateLimit=false;this.autoApply=false;this.singleDatePicker=false;this.showDropdowns=false;this.showWeekNumbers=false;this.showISOWeekNumbers=false;this.showCustomRangeLabel=true;this.timePicker=false;this.timePicker24Hour=false;this.timePickerIncrement=1;this.timePickerSeconds=false;this.linkedCalendars=true;this.autoUpdateInput=true;this.alwaysShowCalendars=false;this.ranges={};this.opens="right";if(this.element.hasClass("pull-right")){this.opens="left"}this.drops="down";if(this.element.hasClass("dropup")){this.drops="up"}this.buttonClasses="btn btn-sm";this.applyClass="btn-success";this.cancelClass="btn-default";this.locale={direction:"ltr",format:c.localeData().longDateFormat("L"),separator:" - ",applyLabel:"Apply",cancelLabel:"Cancel",weekLabel:"W",customRangeLabel:"Custom Range",daysOfWeek:c.weekdaysMin(),monthNames:c.monthsShort(),firstDay:c.localeData().firstDayOfWeek()};this.callback=function(){};this.isShowing=false;this.leftCalendar={};this.rightCalendar={};if(typeof k!=="object"||k===null){k={}}k=a.extend(this.element.data(),k);if(typeof k.template!=="string"&&!(k.template instanceof a)){k.template='<div class="daterangepicker dropdown-menu"><div class="calendar left"><div class="daterangepicker_input"><input class="input-mini form-control" type="text" name="daterangepicker_start" value="" /><i class="fa fa-calendar glyphicon glyphicon-calendar"></i><div class="calendar-time"><div></div><i class="fa fa-clock-o glyphicon glyphicon-time"></i></div></div><div class="calendar-table"></div></div><div class="calendar right"><div class="daterangepicker_input"><input class="input-mini form-control" type="text" name="daterangepicker_end" value="" /><i class="fa fa-calendar glyphicon glyphicon-calendar"></i><div class="calendar-time"><div></div><i class="fa fa-clock-o glyphicon glyphicon-time"></i></div></div><div class="calendar-table"></div></div><div class="ranges"><div class="range_inputs"><button class="applyBtn" disabled="disabled" type="button"></button> <button class="cancelBtn" type="button"></button></div></div></div>'}this.parentEl=(k.parentEl&&a(k.parentEl).length)?a(k.parentEl):a(this.parentEl);this.container=a(k.template).appendTo(this.parentEl);if(typeof k.locale==="object"){if(typeof k.locale.direction==="string"){this.locale.direction=k.locale.direction}if(typeof k.locale.format==="string"){this.locale.format=k.locale.format}if(typeof k.locale.separator==="string"){this.locale.separator=k.locale.separator}if(typeof k.locale.daysOfWeek==="object"){this.locale.daysOfWeek=k.locale.daysOfWeek.slice()}if(typeof k.locale.monthNames==="object"){this.locale.monthNames=k.locale.monthNames.slice()}if(typeof k.locale.firstDay==="number"){this.locale.firstDay=k.locale.firstDay}if(typeof k.locale.applyLabel==="string"){this.locale.applyLabel=k.locale.applyLabel}if(typeof k.locale.cancelLabel==="string"){this.locale.cancelLabel=k.locale.cancelLabel}if(typeof k.locale.weekLabel==="string"){this.locale.weekLabel=k.locale.weekLabel}if(typeof k.locale.customRangeLabel==="string"){var e=document.createElement("textarea");e.innerHTML=k.locale.customRangeLabel;var m=e.value;this.locale.customRangeLabel=m}}this.container.addClass(this.locale.direction);if(typeof k.startDate==="string"){this.startDate=c(k.startDate,this.locale.format)}if(typeof k.endDate==="string"){this.endDate=c(k.endDate,this.locale.format)}if(typeof k.minDate==="string"){this.minDate=c(k.minDate,this.locale.format)}if(typeof k.maxDate==="string"){this.maxDate=c(k.maxDate,this.locale.format)}if(typeof k.startDate==="object"){this.startDate=c(k.startDate)}if(typeof k.endDate==="object"){this.endDate=c(k.endDate)}if(typeof k.minDate==="object"){this.minDate=c(k.minDate)}if(typeof k.maxDate==="object"){this.maxDate=c(k.maxDate)}if(this.minDate&&this.startDate.isBefore(this.minDate)){this.startDate=this.minDate.clone()}if(this.maxDate&&this.endDate.isAfter(this.maxDate)){this.endDate=this.maxDate.clone()}if(typeof k.applyClass==="string"){this.applyClass=k.applyClass}if(typeof k.cancelClass==="string"){this.cancelClass=k.cancelClass}if(typeof k.dateLimit==="object"){this.dateLimit=k.dateLimit}if(typeof k.opens==="string"){this.opens=k.opens}if(typeof k.drops==="string"){this.drops=k.drops}if(typeof k.showWeekNumbers==="boolean"){this.showWeekNumbers=k.showWeekNumbers}if(typeof k.showISOWeekNumbers==="boolean"){this.showISOWeekNumbers=k.showISOWeekNumbers}if(typeof k.buttonClasses==="string"){this.buttonClasses=k.buttonClasses}if(typeof k.buttonClasses==="object"){this.buttonClasses=k.buttonClasses.join(" ")}if(typeof k.showDropdowns==="boolean"){this.showDropdowns=k.showDropdowns}if(typeof k.showCustomRangeLabel==="boolean"){this.showCustomRangeLabel=k.showCustomRangeLabel}if(typeof k.singleDatePicker==="boolean"){this.singleDatePicker=k.singleDatePicker;if(this.singleDatePicker){this.endDate=this.startDate.clone()}}if(typeof k.timePicker==="boolean"){this.timePicker=k.timePicker}if(typeof k.timePickerSeconds==="boolean"){this.timePickerSeconds=k.timePickerSeconds}if(typeof k.timePickerIncrement==="number"){this.timePickerIncrement=k.timePickerIncrement}if(typeof k.timePicker24Hour==="boolean"){this.timePicker24Hour=k.timePicker24Hour}if(typeof k.autoApply==="boolean"){this.autoApply=k.autoApply}if(typeof k.autoUpdateInput==="boolean"){this.autoUpdateInput=k.autoUpdateInput}if(typeof k.linkedCalendars==="boolean"){this.linkedCalendars=k.linkedCalendars}if(typeof k.isInvalidDate==="function"){this.isInvalidDate=k.isInvalidDate}if(typeof k.isCustomDate==="function"){this.isCustomDate=k.isCustomDate}if(typeof k.alwaysShowCalendars==="boolean"){this.alwaysShowCalendars=k.alwaysShowCalendars}if(this.locale.firstDay!=0){var h=this.locale.firstDay;while(h>0){this.locale.daysOfWeek.push(this.locale.daysOfWeek.shift());h--}}var o,g,l;if(typeof k.startDate==="undefined"&&typeof k.endDate==="undefined"){if(a(this.element).is("input[type=text]")){var p=a(this.element).val(),n=p.split(this.locale.separator);o=g=null;if(n.length==2){o=c(n[0],this.locale.format);g=c(n[1],this.locale.format)}else{if(this.singleDatePicker&&p!==""){o=c(p,this.locale.format);g=c(p,this.locale.format)}}if(o!==null&&g!==null){this.setStartDate(o);this.setEndDate(g)}}}if(typeof k.ranges==="object"){for(l in k.ranges){if(typeof k.ranges[l][0]==="string"){o=c(k.ranges[l][0],this.locale.format)}else{o=c(k.ranges[l][0])}if(typeof k.ranges[l][1]==="string"){g=c(k.ranges[l][1],this.locale.format)}else{g=c(k.ranges[l][1])}if(this.minDate&&o.isBefore(this.minDate)){o=this.minDate.clone()}var j=this.maxDate;if(this.dateLimit&&j&&o.clone().add(this.dateLimit).isAfter(j)){j=o.clone().add(this.dateLimit)}if(j&&g.isAfter(j)){g=j.clone()}if((this.minDate&&g.isBefore(this.minDate,this.timepicker?"minute":"day"))||(j&&o.isAfter(j,this.timepicker?"minute":"day"))){continue}var e=document.createElement("textarea");e.innerHTML=l;var m=e.value;this.ranges[m]=[o,g]}var i="<ul>";for(l in this.ranges){i+='<li data-range-key="'+l+'">'+l+"</li>"}if(this.showCustomRangeLabel){i+='<li data-range-key="'+this.locale.customRangeLabel+'">'+this.locale.customRangeLabel+"</li>"}i+="</ul>";this.container.find(".ranges").prepend(i)}if(typeof d==="function"){this.callback=d}if(!this.timePicker){this.startDate=this.startDate.startOf("day");this.endDate=this.endDate.endOf("day");this.container.find(".calendar-time").hide()}if(this.timePicker&&this.autoApply){this.autoApply=false}if(this.autoApply&&typeof k.ranges!=="object"){this.container.find(".ranges").hide()}else{if(this.autoApply){this.container.find(".applyBtn, .cancelBtn").addClass("hide")}}if(this.singleDatePicker){this.container.addClass("single");this.container.find(".calendar.left").addClass("single");this.container.find(".calendar.left").show();this.container.find(".calendar.right").hide();this.container.find(".daterangepicker_input input, .daterangepicker_input > i").hide();if(this.timePicker){this.container.find(".ranges ul").hide()}else{this.container.find(".ranges").hide()}}if((typeof k.ranges==="undefined"&&!this.singleDatePicker)||this.alwaysShowCalendars){this.container.addClass("show-calendar")}this.container.addClass("opens"+this.opens);if(typeof k.ranges!=="undefined"&&this.opens=="right"){this.container.find(".ranges").prependTo(this.container.find(".calendar.left").parent())}this.container.find(".applyBtn, .cancelBtn").addClass(this.buttonClasses);if(this.applyClass.length){this.container.find(".applyBtn").addClass(this.applyClass)}if(this.cancelClass.length){this.container.find(".cancelBtn").addClass(this.cancelClass)}this.container.find(".applyBtn").html(this.locale.applyLabel);this.container.find(".cancelBtn").html(this.locale.cancelLabel);this.container.find(".calendar").on("click.daterangepicker",".prev",a.proxy(this.clickPrev,this)).on("click.daterangepicker",".next",a.proxy(this.clickNext,this)).on("mousedown.daterangepicker","td.available",a.proxy(this.clickDate,this)).on("mouseenter.daterangepicker","td.available",a.proxy(this.hoverDate,this)).on("mouseleave.daterangepicker","td.available",a.proxy(this.updateFormInputs,this)).on("change.daterangepicker","select.yearselect",a.proxy(this.monthOrYearChanged,this)).on("change.daterangepicker","select.monthselect",a.proxy(this.monthOrYearChanged,this)).on("change.daterangepicker","select.hourselect,select.minuteselect,select.secondselect,select.ampmselect",a.proxy(this.timeChanged,this)).on("click.daterangepicker",".daterangepicker_input input",a.proxy(this.showCalendars,this)).on("focus.daterangepicker",".daterangepicker_input input",a.proxy(this.formInputsFocused,this)).on("blur.daterangepicker",".daterangepicker_input input",a.proxy(this.formInputsBlurred,this)).on("change.daterangepicker",".daterangepicker_input input",a.proxy(this.formInputsChanged,this));this.container.find(".ranges").on("click.daterangepicker","button.applyBtn",a.proxy(this.clickApply,this)).on("click.daterangepicker","button.cancelBtn",a.proxy(this.clickCancel,this)).on("click.daterangepicker","li",a.proxy(this.clickRange,this)).on("mouseenter.daterangepicker","li",a.proxy(this.hoverRange,this)).on("mouseleave.daterangepicker","li",a.proxy(this.updateFormInputs,this));if(this.element.is("input")||this.element.is("button")){this.element.on({"click.daterangepicker":a.proxy(this.show,this),"focus.daterangepicker":a.proxy(this.show,this),"keyup.daterangepicker":a.proxy(this.elementChanged,this),"keydown.daterangepicker":a.proxy(this.keydown,this)})}else{this.element.on("click.daterangepicker",a.proxy(this.toggle,this))}if(this.element.is("input")&&!this.singleDatePicker&&this.autoUpdateInput){this.element.val(this.startDate.format(this.locale.format)+this.locale.separator+this.endDate.format(this.locale.format));this.element.trigger("change")}else{if(this.element.is("input")&&this.autoUpdateInput){this.element.val(this.startDate.format(this.locale.format));this.element.trigger("change")}}};b.prototype={constructor:b,setStartDate:function(d){if(typeof d==="string"){this.startDate=c(d,this.locale.format)}if(typeof d==="object"){this.startDate=c(d)}if(!this.timePicker){this.startDate=this.startDate.startOf("day")}if(this.timePicker&&this.timePickerIncrement){this.startDate.minute(Math.round(this.startDate.minute()/this.timePickerIncrement)*this.timePickerIncrement)}if(this.minDate&&this.startDate.isBefore(this.minDate)){this.startDate=this.minDate.clone();if(this.timePicker&&this.timePickerIncrement){this.startDate.minute(Math.round(this.startDate.minute()/this.timePickerIncrement)*this.timePickerIncrement)}}if(this.maxDate&&this.startDate.isAfter(this.maxDate)){this.startDate=this.maxDate.clone();if(this.timePicker&&this.timePickerIncrement){this.startDate.minute(Math.floor(this.startDate.minute()/this.timePickerIncrement)*this.timePickerIncrement)}}if(!this.isShowing){this.updateElement()}this.updateMonthsInView()},setEndDate:function(d){if(typeof d==="string"){this.endDate=c(d,this.locale.format)}if(typeof d==="object"){this.endDate=c(d)}if(!this.timePicker){this.endDate=this.endDate.endOf("day")}if(this.timePicker&&this.timePickerIncrement){this.endDate.minute(Math.round(this.endDate.minute()/this.timePickerIncrement)*this.timePickerIncrement)}if(this.endDate.isBefore(this.startDate)){this.endDate=this.startDate.clone()}if(this.maxDate&&this.endDate.isAfter(this.maxDate)){this.endDate=this.maxDate.clone()}if(this.dateLimit&&this.startDate.clone().add(this.dateLimit).isBefore(this.endDate)){this.endDate=this.startDate.clone().add(this.dateLimit)}this.previousRightTime=this.endDate.clone();if(!this.isShowing){this.updateElement()}this.updateMonthsInView()},isInvalidDate:function(){return false},isCustomDate:function(){return false},updateView:function(){if(this.timePicker){this.renderTimePicker("left");this.renderTimePicker("right");if(!this.endDate){this.container.find(".right .calendar-time select").attr("disabled","disabled").addClass("disabled")}else{this.container.find(".right .calendar-time select").removeAttr("disabled").removeClass("disabled")}}if(this.endDate){this.container.find('input[name="daterangepicker_end"]').removeClass("active");this.container.find('input[name="daterangepicker_start"]').addClass("active")}else{this.container.find('input[name="daterangepicker_end"]').addClass("active");this.container.find('input[name="daterangepicker_start"]').removeClass("active")}this.updateMonthsInView();this.updateCalendars();this.updateFormInputs()},updateMonthsInView:function(){if(this.endDate){if(!this.singleDatePicker&&this.leftCalendar.month&&this.rightCalendar.month&&(this.startDate.format("YYYY-MM")==this.leftCalendar.month.format("YYYY-MM")||this.startDate.format("YYYY-MM")==this.rightCalendar.month.format("YYYY-MM"))&&(this.endDate.format("YYYY-MM")==this.leftCalendar.month.format("YYYY-MM")||this.endDate.format("YYYY-MM")==this.rightCalendar.month.format("YYYY-MM"))){return}this.leftCalendar.month=this.startDate.clone().date(2);if(!this.linkedCalendars&&(this.endDate.month()!=this.startDate.month()||this.endDate.year()!=this.startDate.year())){this.rightCalendar.month=this.endDate.clone().date(2)}else{this.rightCalendar.month=this.startDate.clone().date(2).add(1,"month")}}else{if(this.leftCalendar.month.format("YYYY-MM")!=this.startDate.format("YYYY-MM")&&this.rightCalendar.month.format("YYYY-MM")!=this.startDate.format("YYYY-MM")){this.leftCalendar.month=this.startDate.clone().date(2);this.rightCalendar.month=this.startDate.clone().date(2).add(1,"month")}}if(this.maxDate&&this.linkedCalendars&&!this.singleDatePicker&&this.rightCalendar.month>this.maxDate){this.rightCalendar.month=this.maxDate.clone().date(2);this.leftCalendar.month=this.maxDate.clone().date(2).subtract(1,"month")}},updateCalendars:function(){if(this.timePicker){var e,f,g;if(this.endDate){e=parseInt(this.container.find(".left .hourselect").val(),10);f=parseInt(this.container.find(".left .minuteselect").val(),10);g=this.timePickerSeconds?parseInt(this.container.find(".left .secondselect").val(),10):0;if(!this.timePicker24Hour){var d=this.container.find(".left .ampmselect").val();if(d==="PM"&&e<12){e+=12}if(d==="AM"&&e===12){e=0}}}else{e=parseInt(this.container.find(".right .hourselect").val(),10);f=parseInt(this.container.find(".right .minuteselect").val(),10);g=this.timePickerSeconds?parseInt(this.container.find(".right .secondselect").val(),10):0;if(!this.timePicker24Hour){var d=this.container.find(".right .ampmselect").val();if(d==="PM"&&e<12){e+=12}if(d==="AM"&&e===12){e=0}}}this.leftCalendar.month.hour(e).minute(f).second(g);this.rightCalendar.month.hour(e).minute(f).second(g)}this.renderCalendar("left");this.renderCalendar("right");this.container.find(".ranges li").removeClass("active");if(this.endDate==null){return}this.calculateChosenLabel()},renderCalendar:function(P){var e=P=="left"?this.leftCalendar:this.rightCalendar;var K=e.month.month();var S=e.month.year();var t=e.month.hour();var I=e.month.minute();var N=e.month.second();var q=c([S,K]).daysInMonth();var s=c([S,K,1]);var A=c([S,K,q]);var B=c(s).subtract(1,"month").month();var C=c(s).subtract(1,"month").year();var p=c([C,B]).daysInMonth();var o=s.day();var e=[];e.firstDay=s;e.lastDay=A;for(var v=0;v<6;v++){e[v]=[]}var Q=p-o+this.locale.firstDay+1;if(Q>p){Q-=7}if(o==this.locale.firstDay){Q=p-6}var j=c([C,B,Q,12,I,N]);var h,M;for(var v=0,h=0,M=0;v<42;v++,h++,j=c(j).add(24,"hour")){if(v>0&&h%7===0){h=0;M++}e[M][h]=j.clone().hour(t).minute(I).second(N);j.hour(12);if(this.minDate&&e[M][h].format("YYYY-MM-DD")==this.minDate.format("YYYY-MM-DD")&&e[M][h].isBefore(this.minDate)&&P=="left"){e[M][h]=this.minDate.clone()}if(this.maxDate&&e[M][h].format("YYYY-MM-DD")==this.maxDate.format("YYYY-MM-DD")&&e[M][h].isAfter(this.maxDate)&&P=="right"){e[M][h]=this.maxDate.clone()}}if(P=="left"){this.leftCalendar.calendar=e}else{this.rightCalendar.calendar=e}var H=P=="left"?this.minDate:this.startDate;var E=this.maxDate;var O=P=="left"?this.startDate:this.endDate;var d=this.locale.direction=="ltr"?{left:"chevron-left",right:"chevron-right"}:{left:"chevron-right",right:"chevron-left"};var u='<table class="table-condensed">';u+="<thead>";u+="<tr>";if(this.showWeekNumbers||this.showISOWeekNumbers){u+="<th></th>"}if((!H||H.isBefore(e.firstDay))&&(!this.linkedCalendars||P=="left")){u+='<th class="prev available"><i class="fa fa-'+d.left+" glyphicon glyphicon-"+d.left+'"></i></th>'}else{u+="<th></th>"}var n=this.locale.monthNames[e[1][1].month()]+e[1][1].format(" YYYY");if(this.showDropdowns){var k=e[1][1].month();var l=e[1][1].year();var G=(E&&E.year())||(l+5);var J=(H&&H.year())||(l-50);var x=l==J;var w=l==G;var L='<select class="monthselect">';for(var D=0;D<12;D++){if((!x||D>=H.month())&&(!w||D<=E.month())){L+="<option value='"+D+"'"+(D===k?" selected='selected'":"")+">"+this.locale.monthNames[D]+"</option>"}else{L+="<option value='"+D+"'"+(D===k?" selected='selected'":"")+" disabled='disabled'>"+this.locale.monthNames[D]+"</option>"}}L+="</select>";var T='<select class="yearselect">';for(var R=J;R<=G;R++){T+='<option value="'+R+'"'+(R===l?' selected="selected"':"")+">"+R+"</option>"}T+="</select>";n=L+T}u+='<th colspan="5" class="month">'+n+"</th>";if((!E||E.isAfter(e.lastDay))&&(!this.linkedCalendars||P=="right"||this.singleDatePicker)){u+='<th class="next available"><i class="fa fa-'+d.right+" glyphicon glyphicon-"+d.right+'"></i></th>'}else{u+="<th></th>"}u+="</tr>";u+="<tr>";if(this.showWeekNumbers||this.showISOWeekNumbers){u+='<th class="week">'+this.locale.weekLabel+"</th>"}a.each(this.locale.daysOfWeek,function(m,i){u+="<th>"+i+"</th>"});u+="</tr>";u+="</thead>";u+="<tbody>";if(this.endDate==null&&this.dateLimit){var F=this.startDate.clone().add(this.dateLimit).endOf("day");if(!E||F.isBefore(E)){E=F}}for(var M=0;M<6;M++){u+="<tr>";if(this.showWeekNumbers){u+='<td class="week">'+e[M][0].week()+"</td>"}else{if(this.showISOWeekNumbers){u+='<td class="week">'+e[M][0].isoWeek()+"</td>"}}for(var h=0;h<7;h++){var f=[];if(e[M][h].isSame(new Date(),"day")){f.push("today")}if(e[M][h].isoWeekday()>5){f.push("weekend")}if(e[M][h].month()!=e[1][1].month()){f.push("off")}if(this.minDate&&e[M][h].isBefore(this.minDate,"day")){f.push("off","disabled")}if(E&&e[M][h].isAfter(E,"day")){f.push("off","disabled")}if(this.isInvalidDate(e[M][h])){f.push("off","disabled")}if(e[M][h].format("YYYY-MM-DD")==this.startDate.format("YYYY-MM-DD")){f.push("active","start-date")}if(this.endDate!=null&&e[M][h].format("YYYY-MM-DD")==this.endDate.format("YYYY-MM-DD")){f.push("active","end-date")}if(this.endDate!=null&&e[M][h]>this.startDate&&e[M][h]<this.endDate){f.push("in-range")}var z=this.isCustomDate(e[M][h]);if(z!==false){if(typeof z==="string"){f.push(z)}else{Array.prototype.push.apply(f,z)}}var g="",r=false;for(var v=0;v<f.length;v++){g+=f[v]+" ";if(f[v]=="disabled"){r=true}}if(!r){g+="available"}u+='<td class="'+g.replace(/^\s+|\s+$/g,"")+'" data-title="r'+M+"c"+h+'">'+e[M][h].date()+"</td>"}u+="</tr>"}u+="</tbody>";u+="</table>";this.container.find(".calendar."+P+" .calendar-table").html(u)},renderTimePicker:function(q){if(q=="right"&&!this.endDate){return}var h,p,m,l=this.maxDate;if(this.dateLimit&&(!this.maxDate||this.startDate.clone().add(this.dateLimit).isAfter(this.maxDate))){l=this.startDate.clone().add(this.dateLimit)}if(q=="left"){p=this.startDate.clone();m=this.minDate}else{if(q=="right"){p=this.endDate.clone();m=this.startDate;var t=this.container.find(".calendar.right .calendar-time div");if(t.html()!=""){p.hour(t.find(".hourselect option:selected").val()||p.hour());p.minute(t.find(".minuteselect option:selected").val()||p.minute());p.second(t.find(".secondselect option:selected").val()||p.second());if(!this.timePicker24Hour){var e=t.find(".ampmselect option:selected").val();if(e==="PM"&&p.hour()<12){p.hour(p.hour()+12)}if(e==="AM"&&p.hour()===12){p.hour(0)}}}if(p.isBefore(this.startDate)){p=this.startDate.clone()}if(l&&p.isAfter(l)){p=l.clone()}}}h='<select class="hourselect">';var r=this.timePicker24Hour?0:1;var g=this.timePicker24Hour?23:12;for(var j=r;j<=g;j++){var k=j;if(!this.timePicker24Hour){k=p.hour()>=12?(j==12?12:j+12):(j==12?0:j)}var s=p.clone().hour(k);var f=false;if(m&&s.minute(59).isBefore(m)){f=true}if(l&&s.minute(0).isAfter(l)){f=true}if(k==p.hour()&&!f){h+='<option value="'+j+'" selected="selected">'+j+"</option>"}else{if(f){h+='<option value="'+j+'" disabled="disabled" class="disabled">'+j+"</option>"}else{h+='<option value="'+j+'">'+j+"</option>"}}}h+="</select> ";h+=': <select class="minuteselect">';for(var j=0;j<60;j+=this.timePickerIncrement){var n=j<10?"0"+j:j;var s=p.clone().minute(j);var f=false;if(m&&s.second(59).isBefore(m)){f=true}if(l&&s.second(0).isAfter(l)){f=true}if(p.minute()==j&&!f){h+='<option value="'+j+'" selected="selected">'+n+"</option>"}else{if(f){h+='<option value="'+j+'" disabled="disabled" class="disabled">'+n+"</option>"}else{h+='<option value="'+j+'">'+n+"</option>"}}}h+="</select> ";if(this.timePickerSeconds){h+=': <select class="secondselect">';for(var j=0;j<60;j++){var n=j<10?"0"+j:j;var s=p.clone().second(j);var f=false;if(m&&s.isBefore(m)){f=true}if(l&&s.isAfter(l)){f=true}if(p.second()==j&&!f){h+='<option value="'+j+'" selected="selected">'+n+"</option>"}else{if(f){h+='<option value="'+j+'" disabled="disabled" class="disabled">'+n+"</option>"}else{h+='<option value="'+j+'">'+n+"</option>"}}}h+="</select> "}if(!this.timePicker24Hour){h+='<select class="ampmselect">';var d="";var o="";if(m&&p.clone().hour(12).minute(0).second(0).isBefore(m)){d=' disabled="disabled" class="disabled"'}if(l&&p.clone().hour(0).minute(0).second(0).isAfter(l)){o=' disabled="disabled" class="disabled"'}if(p.hour()>=12){h+='<option value="AM"'+d+'>AM</option><option value="PM" selected="selected"'+o+">PM</option>"}else{h+='<option value="AM" selected="selected"'+d+'>AM</option><option value="PM"'+o+">PM</option>"}h+="</select>"}this.container.find(".calendar."+q+" .calendar-time div").html(h)},updateFormInputs:function(){if(this.container.find("input[name=daterangepicker_start]").is(":focus")||this.container.find("input[name=daterangepicker_end]").is(":focus")){return}this.container.find("input[name=daterangepicker_start]").val(this.startDate.format(this.locale.format));if(this.endDate){this.container.find("input[name=daterangepicker_end]").val(this.endDate.format(this.locale.format))}if(this.singleDatePicker||(this.endDate&&(this.startDate.isBefore(this.endDate)||this.startDate.isSame(this.endDate)))){this.container.find("button.applyBtn").removeAttr("disabled")}else{this.container.find("button.applyBtn").attr("disabled","disabled")}},move:function(){var e={top:0,left:0},d;var f=a(window).width();if(!this.parentEl.is("body")){e={top:this.parentEl.offset().top-this.parentEl.scrollTop(),left:this.parentEl.offset().left-this.parentEl.scrollLeft()};f=this.parentEl[0].clientWidth+this.parentEl.offset().left}if(this.drops=="up"){d=this.element.offset().top-this.container.outerHeight()-e.top}else{d=this.element.offset().top+this.element.outerHeight()-e.top}this.container[this.drops=="up"?"addClass":"removeClass"]("dropup");if(this.opens=="left"){this.container.css({top:d,right:f-this.element.offset().left-this.element.outerWidth(),left:"auto"});if(this.container.offset().left<0){this.container.css({right:"auto",left:9})}}else{if(this.opens=="center"){this.container.css({top:d,left:this.element.offset().left-e.left+this.element.outerWidth()/2-this.container.outerWidth()/2,right:"auto"});if(this.container.offset().left<0){this.container.css({right:"auto",left:9})}}else{this.container.css({top:d,left:this.element.offset().left-e.left,right:"auto"});if(this.container.offset().left+this.container.outerWidth()>a(window).width()){this.container.css({left:"auto",right:0})}}}},show:function(d){if(this.isShowing){return}this._outsideClickProxy=a.proxy(function(f){this.outsideClick(f)},this);a(document).on("mousedown.daterangepicker",this._outsideClickProxy).on("touchend.daterangepicker",this._outsideClickProxy).on("click.daterangepicker","[data-toggle=dropdown]",this._outsideClickProxy).on("focusin.daterangepicker",this._outsideClickProxy);a(window).on("resize.daterangepicker",a.proxy(function(f){this.move(f)},this));this.oldStartDate=this.startDate.clone();this.oldEndDate=this.endDate.clone();this.previousRightTime=this.endDate.clone();this.updateView();this.container.show();this.move();this.element.trigger("show.daterangepicker",this);this.isShowing=true},hide:function(d){if(!this.isShowing){return}if(!this.endDate){this.startDate=this.oldStartDate.clone();this.endDate=this.oldEndDate.clone()}if(!this.startDate.isSame(this.oldStartDate)||!this.endDate.isSame(this.oldEndDate)){this.callback(this.startDate,this.endDate,this.chosenLabel)}this.updateElement();a(document).off(".daterangepicker");a(window).off(".daterangepicker");this.container.hide();this.element.trigger("hide.daterangepicker",this);this.isShowing=false},toggle:function(d){if(this.isShowing){this.hide()}else{this.show()}},outsideClick:function(d){var f=a(d.target);if(d.type=="focusin"||f.closest(this.element).length||f.closest(this.container).length||f.closest(".calendar-table").length){return}this.hide();this.element.trigger("outsideClick.daterangepicker",this)},showCalendars:function(){this.container.addClass("show-calendar");this.move();this.element.trigger("showCalendar.daterangepicker",this)},hideCalendars:function(){this.container.removeClass("show-calendar");this.element.trigger("hideCalendar.daterangepicker",this)},hoverRange:function(f){if(this.container.find("input[name=daterangepicker_start]").is(":focus")||this.container.find("input[name=daterangepicker_end]").is(":focus")){return}var g=f.target.getAttribute("data-range-key");if(g==this.locale.customRangeLabel){this.updateView()}else{var d=this.ranges[g];this.container.find("input[name=daterangepicker_start]").val(d[0].format(this.locale.format));this.container.find("input[name=daterangepicker_end]").val(d[1].format(this.locale.format))}},clickRange:function(f){var g=f.target.getAttribute("data-range-key");this.chosenLabel=g;if(g==this.locale.customRangeLabel){this.showCalendars()}else{var d=this.ranges[g];this.startDate=d[0];this.endDate=d[1];if(!this.timePicker){this.startDate.startOf("day");this.endDate.endOf("day")}if(!this.alwaysShowCalendars){this.hideCalendars()}this.clickApply()}},clickPrev:function(f){var d=a(f.target).parents(".calendar");if(d.hasClass("left")){this.leftCalendar.month.subtract(1,"month");if(this.linkedCalendars){this.rightCalendar.month.subtract(1,"month")}}else{this.rightCalendar.month.subtract(1,"month")}this.updateCalendars()},clickNext:function(f){var d=a(f.target).parents(".calendar");if(d.hasClass("left")){this.leftCalendar.month.add(1,"month")}else{this.rightCalendar.month.add(1,"month");if(this.linkedCalendars){this.leftCalendar.month.add(1,"month")}}this.updateCalendars()},hoverDate:function(h){if(!a(h.target).hasClass("available")){return}var m=a(h.target).attr("data-title");var k=m.substr(1,1);var f=m.substr(3,1);var d=a(h.target).parents(".calendar");var g=d.hasClass("left")?this.leftCalendar.calendar[k][f]:this.rightCalendar.calendar[k][f];if(this.endDate&&!this.container.find("input[name=daterangepicker_start]").is(":focus")){this.container.find("input[name=daterangepicker_start]").val(g.format(this.locale.format))}else{if(!this.endDate&&!this.container.find("input[name=daterangepicker_end]").is(":focus")){this.container.find("input[name=daterangepicker_end]").val(g.format(this.locale.format))}}var i=this.leftCalendar;var j=this.rightCalendar;var l=this.startDate;if(!this.endDate){this.container.find(".calendar tbody td").each(function(q,p){if(a(p).hasClass("week")){return}var s=a(p).attr("data-title");var r=s.substr(1,1);var n=s.substr(3,1);var e=a(p).parents(".calendar");var o=e.hasClass("left")?i.calendar[r][n]:j.calendar[r][n];if((o.isAfter(l)&&o.isBefore(g))||o.isSame(g,"day")){a(p).addClass("in-range")}else{a(p).removeClass("in-range")}})}},clickDate:function(i){if(!a(i.target).hasClass("available")){return}var n=a(i.target).attr("data-title");var l=n.substr(1,1);var g=n.substr(3,1);var f=a(i.target).parents(".calendar");var h=f.hasClass("left")?this.leftCalendar.calendar[l][g]:this.rightCalendar.calendar[l][g];if(this.endDate||h.isBefore(this.startDate,"day")){if(this.timePicker){var j=parseInt(this.container.find(".left .hourselect").val(),10);if(!this.timePicker24Hour){var d=this.container.find(".left .ampmselect").val();if(d==="PM"&&j<12){j+=12}if(d==="AM"&&j===12){j=0}}var k=parseInt(this.container.find(".left .minuteselect").val(),10);var m=this.timePickerSeconds?parseInt(this.container.find(".left .secondselect").val(),10):0;h=h.clone().hour(j).minute(k).second(m)}this.endDate=null;this.setStartDate(h.clone())}else{if(!this.endDate&&h.isBefore(this.startDate)){this.setEndDate(this.startDate.clone())}else{if(this.timePicker){var j=parseInt(this.container.find(".right .hourselect").val(),10);if(!this.timePicker24Hour){var d=this.container.find(".right .ampmselect").val();if(d==="PM"&&j<12){j+=12}if(d==="AM"&&j===12){j=0}}var k=parseInt(this.container.find(".right .minuteselect").val(),10);var m=this.timePickerSeconds?parseInt(this.container.find(".right .secondselect").val(),10):0;h=h.clone().hour(j).minute(k).second(m)}this.setEndDate(h.clone());if(this.autoApply){this.calculateChosenLabel();this.clickApply()}}}if(this.singleDatePicker){this.setEndDate(this.startDate);if(!this.timePicker){this.clickApply()}}this.updateView();i.stopPropagation()},calculateChosenLabel:function(){var d=true;var e=0;for(var f in this.ranges){if(this.timePicker){if(this.startDate.isSame(this.ranges[f][0])&&this.endDate.isSame(this.ranges[f][1])){d=false;this.chosenLabel=this.container.find(".ranges li:eq("+e+")").addClass("active").html();break}}else{if(this.startDate.format("YYYY-MM-DD")==this.ranges[f][0].format("YYYY-MM-DD")&&this.endDate.format("YYYY-MM-DD")==this.ranges[f][1].format("YYYY-MM-DD")){d=false;this.chosenLabel=this.container.find(".ranges li:eq("+e+")").addClass("active").html();break}}e++}if(d){if(this.showCustomRangeLabel){this.chosenLabel=this.container.find(".ranges li:last").addClass("active").html()}else{this.chosenLabel=null}this.showCalendars()}},clickApply:function(d){this.hide();this.element.trigger("apply.daterangepicker",this)},clickCancel:function(d){this.startDate=this.oldStartDate;this.endDate=this.oldEndDate;this.hide();this.element.trigger("cancel.daterangepicker",this)},monthOrYearChanged:function(f){var g=a(f.target).closest(".calendar").hasClass("left"),h=g?"left":"right",d=this.container.find(".calendar."+h);var i=parseInt(d.find(".monthselect").val(),10);var j=d.find(".yearselect").val();if(!g){if(j<this.startDate.year()||(j==this.startDate.year()&&i<this.startDate.month())){i=this.startDate.month();j=this.startDate.year()}}if(this.minDate){if(j<this.minDate.year()||(j==this.minDate.year()&&i<this.minDate.month())){i=this.minDate.month();j=this.minDate.year()}}if(this.maxDate){if(j>this.maxDate.year()||(j==this.maxDate.year()&&i>this.maxDate.month())){i=this.maxDate.month();j=this.maxDate.year()}}if(g){this.leftCalendar.month.month(i).year(j);if(this.linkedCalendars){this.rightCalendar.month=this.leftCalendar.month.clone().add(1,"month")}}else{this.rightCalendar.month.month(i).year(j);if(this.linkedCalendars){this.leftCalendar.month=this.rightCalendar.month.clone().subtract(1,"month")}}this.updateCalendars()},timeChanged:function(g){var f=a(g.target).closest(".calendar"),j=f.hasClass("left");var i=parseInt(f.find(".hourselect").val(),10);var k=parseInt(f.find(".minuteselect").val(),10);var l=this.timePickerSeconds?parseInt(f.find(".secondselect").val(),10):0;if(!this.timePicker24Hour){var d=f.find(".ampmselect").val();if(d==="PM"&&i<12){i+=12}if(d==="AM"&&i===12){i=0}}if(j){var m=this.startDate.clone();m.hour(i);m.minute(k);m.second(l);this.setStartDate(m);if(this.singleDatePicker){this.endDate=this.startDate.clone()}else{if(this.endDate&&this.endDate.format("YYYY-MM-DD")==m.format("YYYY-MM-DD")&&this.endDate.isBefore(m)){this.setEndDate(m.clone())}}}else{if(this.endDate){var h=this.endDate.clone();h.hour(i);h.minute(k);h.second(l);this.setEndDate(h)}}this.updateCalendars();this.updateFormInputs();this.renderTimePicker("left");this.renderTimePicker("right")},formInputsChanged:function(d){var g=a(d.target).closest(".calendar").hasClass("right");var h=c(this.container.find('input[name="daterangepicker_start"]').val(),this.locale.format);var f=c(this.container.find('input[name="daterangepicker_end"]').val(),this.locale.format);if(h.isValid()&&f.isValid()){if(g&&f.isBefore(h)){h=f.clone()}this.setStartDate(h);this.setEndDate(f);if(g){this.container.find('input[name="daterangepicker_start"]').val(this.startDate.format(this.locale.format))}else{this.container.find('input[name="daterangepicker_end"]').val(this.endDate.format(this.locale.format))}}this.updateView()},formInputsFocused:function(d){this.container.find('input[name="daterangepicker_start"], input[name="daterangepicker_end"]').removeClass("active");a(d.target).addClass("active");var f=a(d.target).closest(".calendar").hasClass("right");if(f){this.endDate=null;this.setStartDate(this.startDate.clone());this.updateView()}},formInputsBlurred:function(d){if(!this.endDate){var g=this.container.find('input[name="daterangepicker_end"]').val();var f=c(g,this.locale.format);if(f.isValid()){this.setEndDate(f);this.updateView()}}},elementChanged:function(){if(!this.element.is("input")){return}if(!this.element.val().length){return}if(this.element.val().length<this.locale.format.length){return}var d=this.element.val().split(this.locale.separator),f=null,e=null;if(d.length===2){f=c(d[0],this.locale.format);e=c(d[1],this.locale.format)}if(this.singleDatePicker||f===null||e===null){f=c(this.element.val(),this.locale.format);e=f}if(!f.isValid()||!e.isValid()){return}this.setStartDate(f);this.setEndDate(e);this.updateView()},keydown:function(d){if((d.keyCode===9)||(d.keyCode===13)){this.hide()}},updateElement:function(){if(this.element.is("input")&&!this.singleDatePicker&&this.autoUpdateInput){this.element.val(this.startDate.format(this.locale.format)+this.locale.separator+this.endDate.format(this.locale.format));this.element.trigger("change")}else{if(this.element.is("input")&&this.autoUpdateInput){this.element.val(this.startDate.format(this.locale.format));this.element.trigger("change")}}},remove:function(){this.container.remove();this.element.off(".daterangepicker");this.element.removeData()}};a.fn.daterangepicker=function(e,d){this.each(function(){var f=a(this);if(f.data("daterangepicker")){f.data("daterangepicker").remove()}f.data("daterangepicker",new b(f,e,d))});return this};return b}));