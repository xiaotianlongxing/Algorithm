/**
*杨辉三角
*输入: 5 
*输出: 
*[ 
*[1], 
*[1,1], 
*[1,2,1], 
*[1,3,3,1], 
*[1,4,6,4,1] 
*]
*
**/
public void YangHuiSanjiao {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i )
                    list.add(1);
                else
                    list.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
            ans.add(list);
        }
        return ans;
    }
}
