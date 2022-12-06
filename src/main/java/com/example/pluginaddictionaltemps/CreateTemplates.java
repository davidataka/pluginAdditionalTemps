package com.example.pluginaddictionaltemps;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import org.jetbrains.annotations.NotNull;

import static com.intellij.dvcs.ui.NewBranchAction.icon;
import static com.intellij.util.PlatformIcons.*;

public class CreateTemplates extends CreateFileFromTemplateAction {


    public CreateTemplates() {
        super("Additional Templates", "Templates for test classes and exceptions", icon);
    }
    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder
                .addKind("ExceptionClass", CLASS_ICON, "Exception")
                .addKind("TestsClass", CLASS_ICON, "UnitTests");
    }

    @Override
    protected String getActionName(PsiDirectory directory,
                                   @NotNull String newName, String templateName) {
        return "Create Classes: " + newName+ templateName;
    }

}