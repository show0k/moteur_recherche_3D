<!DOCTYPE javascript>

<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
<meta http-equiv='cache-control' content='no-cache'> 
<meta http-equiv='pragma' content='no-cache'>
<meta http-equiv='expires' content='-1'>
    <body>
        <p>Ceci est une page générée depuis une JSP.</p>
       <p>The time is now <%=new java.util.Date() %></p>
     <p> <%
      String attribut = (String)request.getAttribute("test");
   
      out.println(attribut);
   
      out.println("You are using java"+System.getProperty("java.version"));
      %>
      </p>
      <p> 
      <%
      
      %>
      </p>
     
     
   <script type="text/javascript" src="jsc3d.js"></script>
     <script type="text/javascript" src="jsc3d.touch.js"></script>
      <SPAN style="position : absolute; top :110px;left :500">
     <input id="file" type="file" value="Charger fichierOFF" onchange="onFileSelected(event)">
     </SPAN>
     <SPAN style="position : absolute; top :110px;left :770">
     <input type ="button" value="Envoyer" onclick="Submit()"></input>
     </SPAN>
       <SPAN style="position : absolute; top : 150px;left :500px">
        <canvas id="cv" width=350 height=250 ></canvas>
         </SPAN>
         <SPAN style="position : absolute; top : 420px;left :600px">
           <input type="button" value="Chercher Similarité" onclick="chercher()"></input>
         
         </SPAN>
         <SPAN style="position : absolute; top : 450px;left :130px">
          <canvas id="cv1" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 450px;left :500px">
          <canvas id="cv2" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 450px;left :870px">
          <canvas id="cv3" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 720px;left :130px">
          <canvas id="cv4" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 720px;left :500px">
          <canvas id="cv5" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 720px;left :870px">
          <canvas id="cv6" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 990px;left :130px">
          <canvas id="cv7" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 990px;left :500px">
          <canvas id="cv8" width=350 height=250 ></canvas>
         </SPAN>
          <SPAN style="position : absolute; top : 990px;left :870px">
          <canvas id="cv9" width=350 height=250 ></canvas>
         </SPAN>
         
         <script type="text/javascript">
          
         var viewer = new JSC3D.Viewer(document.getElementById('cv'));
         viewer.setParameter('BackgroundColor1', '#F79F81');
         viewer.setParameter('BackgroundColor2', '#B45F04');
         viewer.setParameter('RenderMode',       'flat');
      
         viewer.setParameter('SceneUrl',  'b2.obj');
         viewer.setParameter('ModelColor',       '#848484');
        
         viewer.init();
         viewer.update();
         
         var viewer1 = new JSC3D.Viewer(document.getElementById('cv1'));
         var viewer2 = new JSC3D.Viewer(document.getElementById('cv2'));
         var viewer3 = new JSC3D.Viewer(document.getElementById('cv3'));
         var viewer4 = new JSC3D.Viewer(document.getElementById('cv4'));
         var viewer5 = new JSC3D.Viewer(document.getElementById('cv5'));
         var viewer6 = new JSC3D.Viewer(document.getElementById('cv6'));
         var viewer7 = new JSC3D.Viewer(document.getElementById('cv7'));
         var viewer8 = new JSC3D.Viewer(document.getElementById('cv8'));
         var viewer9 = new JSC3D.Viewer(document.getElementById('cv9'));
         
         
         viewer1.setParameter('BackgroundColor1', '#F79F81');
         viewer1.setParameter('BackgroundColor2', '#B45F04');
         viewer1.setParameter('RenderMode',       'flat');
         viewer1.setParameter('ModelColor',       '#848484');
         
         viewer2.setParameter('BackgroundColor1', '#F79F81');
         viewer2.setParameter('BackgroundColor2', '#B45F04');
         viewer2.setParameter('RenderMode',       'flat');
         viewer2.setParameter('ModelColor',       '#848484');
         
         viewer3.setParameter('BackgroundColor1', '#F79F81');
         viewer3.setParameter('BackgroundColor2', '#B45F04');
         viewer3.setParameter('RenderMode',       'flat');
         viewer3.setParameter('ModelColor',       '#848484');
         
         viewer4.setParameter('BackgroundColor1', '#F79F81');
         viewer4.setParameter('BackgroundColor2', '#B45F04');
         viewer4.setParameter('RenderMode',       'flat');
         viewer4.setParameter('ModelColor',       '#848484');
         
         viewer5.setParameter('BackgroundColor1', '#F79F81');
         viewer5.setParameter('BackgroundColor2', '#B45F04');
         viewer5.setParameter('RenderMode',       'flat');
         viewer5.setParameter('ModelColor',       '#848484');
         
         viewer6.setParameter('BackgroundColor1', '#F79F81');
         viewer6.setParameter('BackgroundColor2', '#B45F04');
         viewer6.setParameter('RenderMode',       'flat');
         viewer6.setParameter('ModelColor',       '#848484');
         
         viewer7.setParameter('BackgroundColor1', '#F79F81');
         viewer7.setParameter('BackgroundColor2', '#B45F04');
         viewer7.setParameter('RenderMode',       'flat');
         viewer7.setParameter('ModelColor',       '#848484');
         
         viewer8.setParameter('BackgroundColor1', '#F79F81');
         viewer8.setParameter('BackgroundColor2', '#B45F04');
         viewer8.setParameter('RenderMode',       'flat');
         viewer8.setParameter('ModelColor',       '#848484');
         
         viewer9.setParameter('BackgroundColor1', '#F79F81');
         viewer9.setParameter('BackgroundColor2', '#B45F04');
         viewer9.setParameter('RenderMode',       'flat');
         viewer9.setParameter('ModelColor',       '#848484');
         
         viewer1.init();
         viewer2.init();
         viewer3.init();
         viewer4.init();
         viewer5.init();
         viewer6.init();
         viewer7.init();
         viewer8.init();
         viewer9.init();
         
            function onFileSelected(event)
            {
            	var selectedFile = event.target.files[0];
            	//var reader = new FileReader();
               ///var file = document.getElementByID("file").files[0];
               // reader.readAsDataURL(selectedFile);
               var formData = new FormData();
               formData.append('data',selectedFile,selectedFile.name);
                var xhr = new XMLHttpRequest();
               
               xhr.open("POST","http://localhost:8080/test/toto",true);
               xhr.setRequestHeader("calcul","envoi");
               xhr.onload = function () {
            	   if (xhr.status === 200) {
            	     // File(s) uploaded.
            	    // uploadButton.innerHTML = 'Upload';
            	   } else {
            	     alert('An error occurred!');
            	   }
            	 };
               xhr.send(formData);
               
              
         
            	
            	//alert("hi"+selectedFile.name);
            	
            	
            	
            }
            function Submit(){
            	
            	
            	viewer.setParameter('SceneUrl',  "ex1.obj");
                viewer.setParameter('ModelColor',       '#848484');
               
                viewer.init();
                viewer.update();
        
           	
           	
            	
            }
            
            function chercher(){
            	
            	
            	var xhr = new XMLHttpRequest(); 
            	xhr.open("POST","http://localhost:8080/test/toto",true);
            	xhr.setRequestHeader("calcul","calcul");
            	xhr.send();
            	 //alert("hi");
            xhr.onreadystatechange=function()
            {
            	
            	if (xhr.readyState==4)
            		
            		{
            		if (xhr.status==200 || xhr.status==0)
            			{
            		var xhr1 = new XMLHttpRequest();
                    xhr1.open("POST","ordre.txt",true);
                    var text;
                    var lines;
                    //var x=new String("");
                    xhr1.onreadystatechange=function()
                    {
                    	
                    	if (xhr1.readyState==4)
                    		
                    		{
                    		   
                    		   if (xhr1.status==200 || xhr1.status == 0)
                    			   {
                    			   
                    			       text = xhr1.responseText;
                    			       lines = text.split("\n");
                    			      //alert(lines.length);
                    			      for (var i in lines)
                    			    	  {
                    			    	    console.log(lines[i]);
                    			    	    
                    			    	  }
                    			    
                    			      var x0= lines[0].toString();
                    			       var fin0=x0.indexOf("obj");
                    			      //alert(x.substring(0,fin+3));
                    			      //console.log("x = " +x);
                    			      // alert(text);
                    			      viewer1.setParameter('SceneUrl',x0.substring(0,fin0+3) );
                    			      viewer1.init();
                    			      viewer1.update();
                    			      
                    			   var    x1= lines[1].toString();
                   			          var fin1=x1.indexOf("obj");
                   			        viewer2.setParameter('SceneUrl',x1.substring(0,fin1+3) );
                   			        viewer2.init();
                   			        viewer2.update();
                   			        
                   			    var x2= lines[2].toString();
              			          var fin2=x2.indexOf("obj");
              			        viewer3.setParameter('SceneUrl',x2.substring(0,fin2+3) );
              			        viewer3.init();
              			        viewer3.update();
              			        
              			      var x3= lines[3].toString();
           			          var fin3=x3.indexOf("obj");
           			        viewer4.setParameter('SceneUrl',x3.substring(0,fin3+3) );
           			        viewer4.init();
           			        viewer4.update();
           			        
           			         var x4= lines[4].toString();
        			           var fin4=x4.indexOf("obj");
        			           viewer5.setParameter('SceneUrl',x4.substring(0,fin4+3) );
        			          viewer5.init();
        			          viewer5.update();
        			        
        			       var x5= lines[5].toString();
         			          var fin5=x5.indexOf("obj");
         			        viewer6.setParameter('SceneUrl',x5.substring(0,fin5+3) );
         			        viewer6.init();
         			        viewer6.update();
         			        
         			      var x6= lines[6].toString();
        			          var fin6=x6.indexOf("obj");
        			        viewer7.setParameter('SceneUrl',x6.substring(0,fin6+3) );
        			        viewer7.init();
        			        viewer7.update();
                    			      
        			        var x7= lines[7].toString();
        			          var fin7=x7.indexOf("obj");
        			        viewer8.setParameter('SceneUrl',x7.substring(0,fin7+3) );
        			        viewer8.init();
        			        viewer8.update();
                  			      
        			        var x8= lines[8].toString();
        			          var fin8=x8.indexOf("obj");
        			        viewer9.setParameter('SceneUrl',x8.substring(0,fin8+3) );
        			        viewer9.init();
        			        viewer9.update();
                  			      
                    			      
                    			      
                    			   }
                    		 //  alert(x.length);
                               
                    		}
                    	
                    	
                    	
                    	
                    };
                    xhr1.send(null);
            		}
            		}
            	
            	
            	
            };
           /*var xhr1 = new XMLHttpRequest();
            xhr1.open("POST","ordre.txt",true);
            var text;
            var lines;
            //var x=new String("");
            xhr1.onreadystatechange=function()
            {
            	
            	if (xhr1.readyState==4)
            		
            		{
            		   
            		   if (xhr1.status==200 || xhr1.status == 0)
            			   {
            			   
            			       text = xhr1.responseText;
            			       lines = text.split("\n");
            			      //alert(lines.length);
            			      for (var i in lines)
            			    	  {
            			    	    console.log(lines[i]);
            			    	    
            			    	  }
            			    
            			      var x0= lines[0].toString();
            			       var fin0=x0.indexOf("obj");
            			      //alert(x.substring(0,fin+3));
            			      //console.log("x = " +x);
            			      // alert(text);
            			      viewer1.setParameter('SceneUrl',x0.substring(0,fin0+3) );
            			      viewer1.init();
            			      viewer1.update();
            			      
            			   var    x1= lines[1].toString();
           			          var fin1=x1.indexOf("obj");
           			        viewer2.setParameter('SceneUrl',x1.substring(0,fin1+3) );
           			        viewer2.init();
           			        viewer2.update();
           			        
           			    var x2= lines[2].toString();
      			          var fin2=x2.indexOf("obj");
      			        viewer3.setParameter('SceneUrl',x2.substring(0,fin2+3) );
      			        viewer3.init();
      			        viewer3.update();
      			        
      			      var x3= lines[3].toString();
   			          var fin3=x3.indexOf("obj");
   			        viewer4.setParameter('SceneUrl',x3.substring(0,fin3+3) );
   			        viewer4.init();
   			        viewer4.update();
   			        
   			         var x4= lines[4].toString();
			           var fin4=x4.indexOf("obj");
			           viewer5.setParameter('SceneUrl',x4.substring(0,fin4+3) );
			          viewer5.init();
			          viewer5.update();
			        
			       var x5= lines[5].toString();
 			          var fin5=x5.indexOf("obj");
 			        viewer6.setParameter('SceneUrl',x5.substring(0,fin5+3) );
 			        viewer6.init();
 			        viewer6.update();
 			        
 			      var x6= lines[6].toString();
			          var fin6=x6.indexOf("obj");
			        viewer7.setParameter('SceneUrl',x6.substring(0,fin6+3) );
			        viewer7.init();
			        viewer7.update();
            			      
			        var x7= lines[7].toString();
			          var fin7=x7.indexOf("obj");
			        viewer8.setParameter('SceneUrl',x7.substring(0,fin7+3) );
			        viewer8.init();
			        viewer8.update();
          			      
			        var x8= lines[8].toString();
			          var fin8=x8.indexOf("obj");
			        viewer9.setParameter('SceneUrl',x8.substring(0,fin8+3) );
			        viewer9.init();
			        viewer9.update();
          			      
            			      
            			      
            			   }
            		 //  alert(x.length);
                       
            		}
            	
            	
            	
            	
            };
            xhr1.send(null);*/
           
            }
        </script>
        <script type="text/javascript">
        
        
        
     //   document.querySelector('#file').onchange = function() {
        	
        	  
        	
        //	};
        
        	//var fileInput = document.querySelector('#file');
          
        
        //	fileInput.onchange = function() {

        	//    var xhr = new XMLHttpRequest();
                //alert('http://localhost:8080/test'+fileInput.name);
        	  //  xhr.open('POST', 'http://localhost:8080/test'+file.name,true);
               
        	   // xhr.onload = function() {
        	      //  alert('Upload terminé !');
        	    //};
        	   // var form = new FormData();
        	    
        	  //  form.append('file', fileInput.files[0]);
        	  
        	    //xhr.send();
        	     
 
        	//};
        
        
        
        
        
        </script>
        



           
     
     
 
        
     
    </body>
    
</html>