//Script
$(document).ready(function(){ 

    $('.clientes').hide(); // esconde a div clientes
    
    $(window).scroll(function(){ // inicia a função 
        if($(this).scrollTop()>1400){  // se o scroll top, o rolar do mouse do topo for maior que 1400
            $('.clientes').fadeIn(); // revela a div clientes
               
        }
                   
        });

        $('.btt').click(function(){ // ao clicar no botão "btt"
            $('html, body').animate({ // indica que o corpo da página será animado
                scrollTop : 750   // ação : scrollar,descer  até o scroll 750
                
            },2000); // velocidade da descida
         });

    });
   