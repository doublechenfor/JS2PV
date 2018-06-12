/**
 * 
 */
package com.js2pv.too;

/**
 * @author Administrator
 *
 */
public class OutputVisitor implements OutputJSVisitor {
	
	@Override
	public  Object visit(SimpleNode node, Object data) {
		// TODO Auto-generated method stub
		//node.outputpharse();	
		//System.out.println(node.id);
     switch (node.id) {   
		case OutputJSTreeConstants.JJTSTART ://  if(x=1) x=2;else x=3;
		    node.outputpharse();
			node.childrenAccept(this, data);		
			break;
		case OutputJSTreeConstants.JJTPROCESS :
			node.childrenAccept(this, data);
			break;
		case OutputJSTreeConstants.JJTVARSUB :     //13
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case OutputJSTreeConstants.JJTEXP :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINELP :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINERP :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEFUNCTION: //29
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;  //   "/"
		case OutputJSTreeConstants.JJTDEFINEPOINT: // " . "
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
			
		case OutputJSTreeConstants.JJTDEFINECOMMA: // " , "
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case 80:   //  "num"
			//System.out.println(node.jjtGetValue());
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case 51:   //  "."
			//System.out.println(node.jjtGetValue());
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINESMALLER:   //  "<="
			//System.out.println(node.jjtGetValue());
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEBIGGER:   
			//System.out.println(node.jjtGetValue());
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEEQUAL :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		    /*case OutputJSTreeConstants.JJTREQUESTGET:
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTREQUESTPOST:
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTREQUESTSEND :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;  */
	/*	case OutputJSTreeConstants.JJTDEFINEOPEN :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;    */
		case OutputJSTreeConstants.JJTDEFINENULL :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTUSEFUN :   //5
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTYINWORD :   //7
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;

		case OutputJSTreeConstants.JJTNOMEAT :   //6
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;

	/*	case OutputJSTreeConstants.JJTREQUEST :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;  */
		case OutputJSTreeConstants.JJTDEFINEAND :
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEDENGYU :     //30
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEMAOHAO :     //24Ã°ºÅ
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
            ((StringBuffer) data).append(" ");
		    break;  
		case OutputJSTreeConstants.JJTDEFINECBARCE :     // 38
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;	    
		case OutputJSTreeConstants.JJTDEFINENEW:    //26
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTEXPSTUB :
			node.childrenAccept(this, data);
		    break;
		case OutputJSTreeConstants.JJTDIGITSUB :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEEIF :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEETHEN :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTNEWDEFINE : //19
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTNEWDEFINELET :
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTNEWDEFINEIN :
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEEELSE :
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEEELOR :
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
		    break;
		case OutputJSTreeConstants.JJTDEFINEOBRACE :    //37
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;	
		case OutputJSTreeConstants.JJTFUNBLOCK:     //3
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case OutputJSTreeConstants.JJTNEWOBJECT:    //4
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case OutputJSTreeConstants.JJTDEFINEYINHAO :   //39
			node.childrenAccept(this, data);
			//System.out.println(node.jjtGetValue());
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
 
		default:
				node.childrenAccept(this, data);			
		}		
		return data;
	}
	


}
