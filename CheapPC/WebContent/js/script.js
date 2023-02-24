var flag = true;
$('button').on('click', function() {
  $('.block-signup').toggleClass('is-active');
  if(flag == true){
     $('new').hide();
     flag = false;
  }else{
    $('new').show();
    flag = true;
  }  
});