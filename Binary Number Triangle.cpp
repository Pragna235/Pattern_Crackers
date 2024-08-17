/*
    Time Complexity - O(N^2)
    Space Complexity - O( 1 )

    where N is the given input.
*/

void nBinaryTriangle(int n) {
    int start=0;
    for(int i=0;i<n;i++){
        if(i%2==0) start=1;
        else start=0;
        for(int j=0;j<=i;j++){
            cout<<start<<" ";
            start = 1-start;
        }
        cout<<endl;
    }
}
