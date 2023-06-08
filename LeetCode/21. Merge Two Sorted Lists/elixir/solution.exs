# Definition for singly-linked list.
#
# defmodule ListNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           next: ListNode.t() | nil
#         }
#   defstruct val: 0, next: nil
# end

defmodule Solution do
  @spec merge_two_lists(list1 :: ListNode.t() | nil, list2 :: ListNode.t() | nil) ::
          ListNode.t() | nil
  def merge_two_lists(list1, list2) do
    sort_merge(list1, list2)
  end

  defp sort_merge(l1, l2, acc_list \\ [])

  defp sort_merge(nil, nil, acc_list) do
    to_list_node_struct(acc_list)
  end

  defp sort_merge(nil, %{val: v, next: n}, acc_list) do
    sort_merge(nil, n, [v | acc_list])
  end

  defp sort_merge(%{val: v, next: n}, nil, acc_list) do
    sort_merge(n, nil, [v | acc_list])
  end

  defp sort_merge(%{val: v1, next: n1} = l1, %{val: v2, next: n2} = l2, acc_list) do
    if v1 < v2 do
      sort_merge(n1, l2, [v1 | acc_list])
    else
      sort_merge(l1, n2, [v2 | acc_list])
    end
  end

  defp to_list_node_struct(list, acc_node \\ nil)

  defp to_list_node_struct([], acc_node) do
    acc_node
  end

  defp to_list_node_struct([h | t], acc_node) do
    to_list_node_struct(t, %ListNode{val: h, next: acc_node})
  end
end
