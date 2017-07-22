package ru.asfarus.tests.archivator;

import java.io.File;
import java.util.HashSet;

/**
 * Created by asfarus on 22.07.2017.
 */

class SelectedFilesModel {
    private File mCurrentDir;
    private HashSet<File> mSelectedFilesSet;

    public SelectedFilesModel(File mCurrentDir) {
        this.mCurrentDir = mCurrentDir;
    }
}
