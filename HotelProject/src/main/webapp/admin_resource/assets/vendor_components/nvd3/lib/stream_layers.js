function stream_layers(c,b,d){if(arguments.length<3){d=0}function a(e){var h=1/(0.1+Math.random()),j=2*Math.random()-0.5,k=10/(0.1+Math.random());for(var f=0;f<b;f++){var g=(f/b-j)*k;e[f]+=h*Math.exp(-g*g)}}return d3.range(c).map(function(){var e=[],f;for(f=0;f<b;f++){e[f]=d+d*Math.random()}for(f=0;f<5;f++){a(e)}return e.map(stream_index)})}function stream_waves(b,a){return d3.range(b).map(function(c){return d3.range(a).map(function(d){var e=20*d/a-c/3;return 2*e*Math.exp(-0.5*e)}).map(stream_index)})}function stream_index(a,b){return{x:b,y:Math.max(0,a)}};