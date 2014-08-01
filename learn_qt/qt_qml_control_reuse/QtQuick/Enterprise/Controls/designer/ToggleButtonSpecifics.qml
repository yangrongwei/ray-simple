/****************************************************************************
**
** Copyright (C) 2013 Digia Plc
** All rights reserved.
** For any questions to Digia, please use contact form at http://qt.digia.com
**
** This file is part of the QtQuick Enterprise Controls Add-on.
**
** $QT_BEGIN_LICENSE$
** Licensees holding valid Qt Commercial licenses may use this file in
** accordance with the Qt Commercial License Agreement provided with the
** Software or, alternatively, in accordance with the terms contained in
** a written agreement between you and Digia.
**
** If you have questions regarding the use of this file, please use
** contact form at http://qt.digia.com
** $QT_END_LICENSE$
**
****************************************************************************/

import QtQuick 2.1
import HelperWidgets 2.0
import QtQuick.Layouts 1.0

Column {
    anchors.left: parent.left
    anchors.right: parent.right

    Section {
        anchors.left: parent.left
        anchors.right: parent.right
        caption: qsTr("ToggleButton")

        SectionLayout {
            Label {
                text: qsTr("Text")
                toolTip: qsTr("Text")
            }
            SecondColumnLayout {
                LineEdit {
                    backendValue: backendValues.text
                    showTranslateCheckBox: true
                    implicitWidth: 180
                }
                ExpandingSpacer {
                }
            }

//            Label {
//                text: qsTr("Disable Button")
//                toolTip: qsTr("Disable Button")
//            }
//            SecondColumnLayout {
//                CheckBox {
//                    backendValue: backendValues.disabled
//                    implicitWidth: 180
//                }
//                ExpandingSpacer {
//                }
//            }

            Label {
                text: qsTr("Checked")
                toolTip: qsTr("Checked")
            }
            SecondColumnLayout {
                CheckBox {
                    backendValue: backendValues.checked
                    implicitWidth: 180
                }
                ExpandingSpacer {
                }
            }
        }
    }
}
