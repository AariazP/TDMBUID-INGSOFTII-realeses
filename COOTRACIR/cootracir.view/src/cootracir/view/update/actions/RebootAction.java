package cootracir.view.update.actions;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.IWorkbenchPart;
import cootracir.view.views.*;

import cootracir.view.model.*;

public class RebootAction implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	public RebootAction() {
		}

	public void run(IAction action) {
		try {
			ModelFactoryModel.getInstance().actualizarEstado("iniciar");
			IWorkbenchPage[] pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPages();
			for (IWorkbenchPage iWorkbenchPage : pages) {
			  for (IViewPart iWorkbenchPage2 : iWorkbenchPage.getViews()) {
					if(iWorkbenchPage2 instanceof RegistroBaseViewPart) {
		            RegistroBaseViewPart registroBaseViewPart = (RegistroBaseViewPart)iWorkbenchPage2;
		            registroBaseViewPart.reboot();
		             					}
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
   public void selectionChanged(IAction action, ISelection selection) {
   }

   public void dispose()  {
   }

   public void init(IWorkbenchWindow window) {
     this.window = window;
  }
   }

