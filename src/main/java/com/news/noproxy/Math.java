package com.news.noproxy;

/**
 * 
 * 项目名称：proxyDemo
 * 类名称：Math
 * 类描述： 假设需实现一个计算的类Math、完成加、减、乘、除功能 
 * 创建人：Administrator 
 * 创建时间：2017年11月22日 下午2:56:56
 * 修改人：Administrator 
 * 修改时间：2017年11月22日 下午2:56:56
 * 修改备注： 
 * @version
 */
public class Math {

    //加
    public int add(int n1,int n2){
        int result=n1+n2;
        System.out.println(n1+"+"+n2+"="+result);
        return result;
    }
    
    
    //减
    public int sub(int n1,int n2){
        int result=n1-n2;
        System.out.println(n1+"-"+n2+"="+result);
        return result;
    }
    
    //乘
    public int mut(int n1,int n2){
        int result=n1*n2;
        System.out.println(n1+"X"+n2+"="+result);
        return result;
    }
    
    //除
    public int div(int n1,int n2){
        int result=n1/n2;
        System.out.println(n1+"/"+n2+"="+result);
        return result;
    }
    
}