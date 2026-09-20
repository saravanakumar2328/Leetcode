class Solution {
    public int reverseDegree(String s) {

        int k=0;
        for(int i=0;i<s.length();i++){
            char cc=s.charAt(i);
            if(cc=='a'){
                k+=(i+1)*26;

            }
            else if(cc=='b'){
               k+=(i+1)*25; 
            }
             else if(cc=='c'){
               k+=(i+1)*24; 
            }
             else if(cc=='d'){
               k+=(i+1)*23; 
            }
             else if(cc=='e'){
               k+=(i+1)*22; 
            }
             else if(cc=='f'){
               k+=(i+1)*21; 
            }
             else if(cc=='g'){
               k+=(i+1)*20; 
            }
             else if(cc=='h'){
               k+=(i+1)*19; 
            }
             else if(cc=='i'){
               k+=(i+1)*18; 
            }
             else if(cc=='j'){
               k+=(i+1)*17; 
            }
             else if(cc=='k'){
               k+=(i+1)*16; 
            }
             else if(cc=='l'){
               k+=(i+1)*15; 
            }
             else if(cc=='m'){
               k+=(i+1)*14; 
            }
             else if(cc=='n'){
               k+=(i+1)*13; 
            }
             else if(cc=='o'){
               k+=(i+1)*12; 
            }
             else if(cc=='p'){
               k+=(i+1)*11; 
            }
             else if(cc=='q'){
               k+=(i+1)*10; 
            }
             else if(cc=='r'){
               k+=(i+1)*9; 
            }
             else if(cc=='s'){
               k+=(i+1)*8; 
            }
             else if(cc=='t'){
               k+=(i+1)*7; 
            }
             else if(cc=='u'){
               k+=(i+1)*6; 
            }
             else if(cc=='v'){
               k+=(i+1)*5; 
            }
             else if(cc=='w'){
               k+=(i+1)*4; 
            }
             else if(cc=='x'){
               k+=(i+1)*3; 
            }
             else if(cc=='y'){
               k+=(i+1)*2; 
            }
             
             else if(cc=='z'){
               k+=(i+1)*1;

            }
            else{

            }


        }
        return k;
        
    }
}