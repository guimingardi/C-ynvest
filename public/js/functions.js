//Script
$(document).ready(function(){ 

    $('.numeros').hide(); // esconde a div numeros
    
    $(window).scroll(function(){ // inicia a função 
        if($(this).scrollTop()>2200){  // se o scroll top, o rolar do mouse do topo for maior que 2200
            $('.numeros').fadeIn(); // revela a div clientes
               
        }
                   
        });

        $('.btt').click(function(){ 
            $('html, body').animate({ 
                scrollTop : 750   
                
            },1500); 
         });

         $('.btHome').click(function(){ 
            $('html, body').animate({ 
                scrollTop : 0  
                
            },1500); 
         });

         $('.btSobre').click(function(){ 
            $('html, body').animate({ 
                scrollTop : 750   
                
            },1500); 
         });

         $('.btProdutos').click(function(){ 
            $('html, body').animate({ 
                scrollTop : 1700   
                
            },1500); 
         });

         $('.btMetricas').click(function(){ 
         $('html, body').animate({ 
             scrollTop : 2450   
             
         },1500);
      });
        
         $('.btTime').click(function(){ 
         $('html, body').animate({ 
             scrollTop : 3000   
         },1500); 
      });


    });
   
