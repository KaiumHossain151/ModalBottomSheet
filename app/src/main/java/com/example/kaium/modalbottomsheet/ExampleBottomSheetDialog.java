package com.example.kaium.modalbottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ExampleBottomSheetDialog extends BottomSheetDialogFragment {

    private BottomSheetListener mBottomSheetListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet, container,false);

        Button proceedPayment = view.findViewById(R.id.btn_proceed_payment);

        proceedPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBottomSheetListener.onButtonClicked("Proceed for payment");
                dismiss();
            }
        });

        return view;
    }

    public interface BottomSheetListener{
        void onButtonClicked(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            mBottomSheetListener = (BottomSheetListener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString() + " must implement BottomSheetListener");
        }
    }
}
